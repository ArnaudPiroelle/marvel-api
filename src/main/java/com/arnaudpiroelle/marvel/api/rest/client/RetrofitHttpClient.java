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
package com.arnaudpiroelle.marvel.api.rest.client;

import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import retrofit.client.Request;
import retrofit.client.UrlConnectionClient;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class RetrofitHttpClient extends UrlConnectionClient {

    private static final int CONNECT_TIMEOUT_SEC = 60;
    private static final int READ_TIMEOUT_SEC = 85;

    private static OkUrlFactory generateDefaultOkUrlFactory() {
        OkHttpClient client = new com.squareup.okhttp.OkHttpClient();
        client.setConnectTimeout(CONNECT_TIMEOUT_SEC, TimeUnit.SECONDS);
        client.setReadTimeout(READ_TIMEOUT_SEC, TimeUnit.SECONDS);

        try {
            File cacheDir = new File(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
            Cache cache = new Cache(cacheDir, 1024);
            client.setCache(cache);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new OkUrlFactory(client);
    }

    private final OkUrlFactory factory;

    public RetrofitHttpClient() {
        factory = generateDefaultOkUrlFactory();
    }

    @Override protected HttpURLConnection openConnection(Request request) throws IOException {
        return factory.open(new URL(request.getUrl()));
    }
}
