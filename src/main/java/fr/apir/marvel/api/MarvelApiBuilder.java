/**
 * Copyright (C) 2014 Arnaud Piroelle (contact@arnaudpiroelle.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.apir.marvel.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;
import fr.apir.marvel.api.exceptions.ApiBuilderNotInitializedException;
import fr.apir.marvel.api.rest.handlers.RestServiceErrorHandler;
import fr.apir.marvel.api.rest.interceptors.RestRequestInterceptor;
import retrofit.Endpoint;
import retrofit.Endpoints;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

import java.util.Date;

/**
 * Created by Piroelle on 04/03/14.
 */
public class MarvelApiBuilder {
    private static RestAdapter restAdapter = null;
    private static Endpoint endpoint;

    private static final Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeAdapter(Date.class, new DateTypeAdapter())
            .create();

    private static RestRequestInterceptor restRequestInterceptor = null;

    public static void initMarvelApiBuilder(String publicApiKey, String privateApiKey) {
        if (restRequestInterceptor == null) {
            restRequestInterceptor = new RestRequestInterceptor(publicApiKey, privateApiKey);
        }
    }

    public static RestAdapter getAdapter() throws ApiBuilderNotInitializedException {
        if (restRequestInterceptor == null) {
            throw new ApiBuilderNotInitializedException();
        }

        if (restAdapter == null) {
            restAdapter = new RestAdapter.Builder()
                    .setEndpoint(getEndpoint())
                    .setConverter(new GsonConverter(gson))
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setErrorHandler(new RestServiceErrorHandler())
                    .setRequestInterceptor(restRequestInterceptor)
                    .build();
        }

        return restAdapter;
    }

    public static <T> T getService(Class<T> serviceClass) throws ApiBuilderNotInitializedException {
        return getAdapter().create(serviceClass);
    }

    public static Endpoint getEndpoint() {
        if (endpoint == null) {
            endpoint = Endpoints.newFixedEndpoint("http://gateway.marvel.com");
        }
        return endpoint;
    }


}
