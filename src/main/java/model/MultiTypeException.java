package model;

public class MultiTypeException extends RuntimeException  {

    public MultiTypeException() {
        super();
    }

    public MultiTypeException(String message) {
        super(message);
    }

    public MultiTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MultiTypeException(Throwable cause) {
        super(cause);
    }

    protected MultiTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
