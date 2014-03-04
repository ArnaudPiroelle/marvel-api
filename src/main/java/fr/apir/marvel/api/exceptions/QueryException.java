package fr.apir.marvel.api.exceptions;

/**
 * Created by Piroelle on 04/03/14.
 */
public class QueryException extends Throwable {
    public QueryException() {
        super();
    }

    public QueryException(String message) {
        super(message);
    }

    public QueryException(Throwable cause) {
        super(cause);
    }

    public QueryException(String message, Throwable cause) {
        super(message, cause);
    }
}
