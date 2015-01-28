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
import com.arnaudpiroelle.marvel.api.services.sync.CharactersService;
import com.arnaudpiroelle.marvel.api.rest.client.RetrofitHttpClient;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import retrofit.converter.GsonConverter;

import static org.fest.assertions.api.Assertions.assertThat;
import static retrofit.RestAdapter.LogLevel.NONE;

public class MarvelApiBuilderTest {

    @Before
    public void setUp(){
        MarvelApi.configure().reset();
    }

    @Test
    public void should_get_service_if_marvel_api_initialized() throws Exception {
        MarvelApi
                .configure()
                .withLogLevel(NONE)
                .withConvertor(new GsonConverter(new Gson()))
                .withErrorHandler(new RestServiceErrorHandler())
                .withEndpoint("http://gateway.marvel.com")
                .withApiKeys("public", "private")
                .withClient(new RetrofitHttpClient())
                .init();

        CharactersService charactersService = MarvelApi.getService(CharactersService.class);
        assertThat(charactersService).isNotNull();
    }

    @Test(expected = MarvelApiNotInitializedException.class)
    public void should_throw_exception_if_marvel_api_not_initialized() throws Exception {
        CharactersService charactersService = MarvelApi.getService(CharactersService.class);
    }

}