package fr.apir.marvel.api.exceptions;

/**
 * Created by Piroelle on 05/03/14.
 */
public class RateLimitException extends Throwable {
    public RateLimitException() {
        super();
    }

    public RateLimitException(String message) {
        super(message);
    }

    public RateLimitException(Throwable cause) {
        super(cause);
    }

    public RateLimitException(String message, Throwable cause) {
        super(message, cause);
    }
}
