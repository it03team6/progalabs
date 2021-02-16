package ua.kpi.fict.acts.it03.proga.lab13;

public class MarkBookException extends Exception{
    public MarkBookException() {
    }

    public MarkBookException(String message) {
        super(message);
    }

    public MarkBookException(String message, Throwable cause) {
        super(message, cause);
    }

    public MarkBookException(Throwable cause) {
        super(cause);
    }

    public MarkBookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
