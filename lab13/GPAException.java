package ua.kpi.fict.acts.it03.proga.lab13;

public class GPAException extends Exception{
    public GPAException() {
    }

    public GPAException(String message) {
        super(message);
    }

    public GPAException(String message, Throwable cause) {
        super(message, cause);
    }

    public GPAException(Throwable cause) {
        super(cause);
    }

    public GPAException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
