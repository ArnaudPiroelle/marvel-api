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
package fr.apir.marvel.api.rest.interceptors;

import fr.apir.marvel.api.util.MD5Util;
import retrofit.RequestInterceptor;

import java.util.Date;

/**
 * Created by Piroelle on 04/03/14.
 */
public class RestRequestInterceptor implements RequestInterceptor {

    private String apiKeyPublic = "";
    private String apiKeyPrivate = "";

    public RestRequestInterceptor(String publicApiKey, String privateApiKey) {
        this.apiKeyPrivate = privateApiKey;
        this.apiKeyPublic = publicApiKey;
    }

    @Override
    public void intercept(RequestFacade request) {
        // Gestion du content type par défaut pour l'api
        request.addHeader("Content-Type", "application/json");

        // Gestion de l'authentification (server-side)
        String timestamp = String.valueOf(new Date().getTime());

        request.addEncodedQueryParam("apikey", apiKeyPublic);
        request.addEncodedQueryParam("ts", timestamp);
        request.addEncodedQueryParam("hash", MD5Util.hash(apiKeyPublic, apiKeyPrivate, timestamp));

    }
}
