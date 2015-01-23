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
package com.arnaudpiroelle.marvel.api.rest.handlers;

import com.arnaudpiroelle.marvel.api.exceptions.AuthorizationException;
import com.arnaudpiroelle.marvel.api.exceptions.EntityNotFoundException;
import com.arnaudpiroelle.marvel.api.exceptions.QueryException;
import com.arnaudpiroelle.marvel.api.exceptions.RateLimitException;
import com.arnaudpiroelle.marvel.api.objects.ref.ErrorResponse;
import retrofit.ErrorHandler;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Arnaud Piroelle on 04/03/14.
 */
public class RestServiceErrorHandler implements ErrorHandler {
    @Override
    public Throwable handleError(RetrofitError cause) {
        Response r = cause.getResponse();
        ErrorResponse data = (ErrorResponse) cause.getBodyAs(ErrorResponse.class);

        if (r != null) {
            if (r.getStatus() == 401) {
                return new AuthorizationException(data.getMessage(), cause);
            } else if (r.getStatus() == 403) {
                //TODO: Forbidden
            } else if (r.getStatus() == 404) {
                return new EntityNotFoundException(data.getMessage(), cause);
            } else if (r.getStatus() == 405) {
                //TODO: Method Not Allowed
            } else if (r.getStatus() == 409) {
                return new QueryException(data.getMessage(), cause);
            } else if (r.getStatus() == 429) {
                return new RateLimitException(data.getMessage(), cause);
            }


        }

        return cause;
    }
}
