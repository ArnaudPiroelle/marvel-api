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