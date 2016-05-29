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

import com.arnaudpiroelle.marvel.api.exceptions.MarvelApiNotInitializedException;
import com.arnaudpiroelle.marvel.api.rest.handlers.RestServiceErrorHandler;
import com.arnaudpiroelle.marvel.api.rest.interceptors.RestRequestInterceptor;
import com.arnaudpiroelle.marvel.api.rest.client.RetrofitHttpClient;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit.Endpoint;
import retrofit.Endpoints;
import retrofit.ErrorHandler;
import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;
import retrofit.client.Client;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

public class MarvelApi {

    private static MarvelApi marvelApi = null;

    public static <T> T getService(Class<T> serviceClass) throws MarvelApiNotInitializedException {

        if (marvelApi == null){
            throw new MarvelApiNotInitializedException();
        }
        return marvelApi.getRestAdapter().create(serviceClass);
    }

    public static Builder configure(){
        return new Builder();
    }

    private MarvelApi() {

    }

    private RestAdapter restAdapter;
    private RestRequestInterceptor restRequestInterceptor;

    private MarvelApi(Client client, LogLevel logLevel, Converter convertor, ErrorHandler errorHandler, Endpoint endpoint, String apiKeyPublic, String apiKeyPrivate) {
        restRequestInterceptor = new RestRequestInterceptor(apiKeyPublic, apiKeyPrivate);

        restAdapter = new RestAdapter.Builder()
                .setEndpoint(endpoint)
                .setConverter(convertor)
                .setLogLevel(logLevel)
                .setErrorHandler(errorHandler)
                .setRequestInterceptor(restRequestInterceptor)
                .setClient(client)
                .build();
    }

    private RestAdapter getRestAdapter() {
        return restAdapter;
    }

    public static class Builder {

        private static final Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                //.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        private LogLevel logLevel= LogLevel.FULL;
        private Converter convertor = new GsonConverter(gson);
        private ErrorHandler errorHandler = new RestServiceErrorHandler();
        private Endpoint endpoint = Endpoints.newFixedEndpoint("http://gateway.marvel.com");
        private String apiKeyPublic;
        private String apiKeyPrivate;
        private Client client = new RetrofitHttpClient();

        private Builder() {
        }

        public Builder withLogLevel(LogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder withConvertor(Converter converter) {
            this.convertor = converter;
            return this;
        }

        public Builder withErrorHandler(ErrorHandler errorHandler) {
            this.errorHandler = errorHandler;
            return this;
        }

        public Builder withEndpoint(String endpoint) {
            this.endpoint = Endpoints.newFixedEndpoint(endpoint);
            return this;
        }

        public Builder withClient(Client client) {
            this.client = client;
            return this;
        }

        public Builder withApiKeys(String apiKeyPublic, String apiKeyPrivate) {
            this.apiKeyPublic = apiKeyPublic;
            this.apiKeyPrivate = apiKeyPrivate;
            return this;
        }

        public void init(){
            marvelApi = new MarvelApi(client, logLevel, convertor, errorHandler, endpoint, apiKeyPublic, apiKeyPrivate);
        }

        public void reset(){
            marvelApi = null;
        }
    }
}
