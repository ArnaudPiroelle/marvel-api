package fr.apir.marvel.api.rest;

import fr.apir.marvel.api.exceptions.AuthorizationException;
import fr.apir.marvel.api.exceptions.QueryException;
import fr.apir.marvel.api.objects.ref.DataWrapper;
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
        DataWrapper data = (DataWrapper) cause.getBodyAs(DataWrapper.class);
        if (r != null) {
            if (r.getStatus() == 401) {
                return new AuthorizationException(data.getStatus(), cause);
            } else if (r.getStatus() == 409) {
                return new QueryException(data.getStatus(), cause);
            }

        }
        return cause;
    }
}
