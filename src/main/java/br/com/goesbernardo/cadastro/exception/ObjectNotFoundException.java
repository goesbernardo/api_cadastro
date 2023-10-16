package br.com.goesbernardo.cadastro.exception;

public class ObjectNotFoundException extends RuntimeException {


    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(String message, Exception cause) {
        super(message, cause);
    }

    public ObjectNotFoundException(Exception cause) {
        super(cause);
    }


}
