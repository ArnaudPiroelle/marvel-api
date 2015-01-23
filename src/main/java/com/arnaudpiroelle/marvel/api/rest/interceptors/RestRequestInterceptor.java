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
package com.arnaudpiroelle.marvel.api.rest.interceptors;

import com.arnaudpiroelle.marvel.api.util.MD5Util;
import retrofit.RequestInterceptor;

import java.util.Date;

/**
 * Created by Arnaud Piroelle on 04/03/14.
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
        // Default Content Type
        request.addHeader("Content-Type", "application/json");

        // Default api key
        Date now = new Date();
        String timestamp = String.valueOf(now.getTime());

        request.addEncodedQueryParam("apikey", apiKeyPublic);
        request.addEncodedQueryParam("ts", timestamp);
        request.addEncodedQueryParam("hash", MD5Util.hash(apiKeyPublic, apiKeyPrivate, timestamp));

    }
}
