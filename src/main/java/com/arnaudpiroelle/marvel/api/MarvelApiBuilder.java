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
package com.arnaudpiroelle.marvel.api;

import com.arnaudpiroelle.marvel.api.exceptions.ApiBuilderNotInitializedException;
import com.arnaudpiroelle.marvel.api.rest.handlers.RestServiceErrorHandler;
import com.arnaudpiroelle.marvel.api.rest.interceptors.RestRequestInterceptor;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;
import retrofit.Endpoint;
import retrofit.Endpoints;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

import java.util.Date;

/**
 * ApiBuilder used to get implementated Services
 *
 * @author Arnaud Piroelle
 * @version 1.0
 */
public class MarvelApiBuilder {
    private static final Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    private static RestAdapter restAdapter = null;
    private static Endpoint endpoint;
    private static RestRequestInterceptor restRequestInterceptor = null;

    /**
     * Init method
     *
     * @param publicApiKey  Your public ApiKey
     * @param privateApiKey Your private ApiKey
     */
    public static void initMarvelApiBuilder(String publicApiKey, String privateApiKey) {
        if (restRequestInterceptor == null) {
            restRequestInterceptor = new RestRequestInterceptor(publicApiKey, privateApiKey);
        }
    }

    private static RestAdapter getAdapter() throws ApiBuilderNotInitializedException {
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

    /**
     * Method used to get implemented service
     *
     * @param serviceClass Service class
     * @param <T>          Service class
     * @return service
     * @throws ApiBuilderNotInitializedException Init Exception APIBuilder
     */
    public static <T> T getService(Class<T> serviceClass) throws ApiBuilderNotInitializedException {
        return getAdapter().create(serviceClass);
    }

    /**
     * Method used to change endpoint url
     *
     * @return Api Endpoint
     */
    public static Endpoint getEndpoint() {
        if (endpoint == null) {
            endpoint = Endpoints.newFixedEndpoint("http://gateway.marvel.com");
        }
        return endpoint;
    }


}
