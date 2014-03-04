package fr.apir.marvel.api.exceptions;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Piroelle on 04/03/14.
 */
public class RestServiceErrorHandler implements ErrorHandler {
    @Override
    public Throwable handleError(RetrofitError cause) {
        Response r = cause.getResponse();
        //TODO: Gérer les exceptions de l'api rest
        if (r != null && r.getStatus() == 401) {

        }
        return cause;
    }
}
