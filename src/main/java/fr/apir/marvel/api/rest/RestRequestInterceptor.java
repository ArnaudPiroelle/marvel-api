package fr.apir.marvel.api.rest;

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
