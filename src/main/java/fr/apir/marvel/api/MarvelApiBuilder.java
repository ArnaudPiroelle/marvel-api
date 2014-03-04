package fr.apir.marvel.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;
import fr.apir.marvel.api.exceptions.ApiBuilderNotInitializedException;
import fr.apir.marvel.api.exceptions.RestServiceErrorHandler;
import fr.apir.marvel.api.interceptors.RestRequestInterceptor;
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
