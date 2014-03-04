package fr.apir.marvel.api.rest;

import fr.apir.marvel.api.exceptions.AuthorizationException;
import fr.apir.marvel.api.exceptions.QueryException;
import fr.apir.marvel.api.objects.ref.ErrorResponse;
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
        ErrorResponse data = (ErrorResponse) cause.getBodyAs(ErrorResponse.class);

        if (r != null) {
            if (r.getStatus() == 401) {
                return new AuthorizationException(data.getMessage(), cause);
            } else if (r.getStatus() == 409) {
                return new QueryException(data.getMessage(), cause);
            }

        }

        return cause;
    }
}
