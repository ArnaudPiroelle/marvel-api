package fr.apir.marvel.api.exceptions;

/**
 * Created by Piroelle on 04/03/14.
 */
public class ApiBuilderNotInitializedException extends Exception {
    public ApiBuilderNotInitializedException() {
        super();
    }

    public ApiBuilderNotInitializedException(String message) {
        super(message);
    }

    public ApiBuilderNotInitializedException(Throwable cause) {
        super(cause);
    }

    public ApiBuilderNotInitializedException(String message, Throwable cause) {
        super(message, cause);
    }

}
