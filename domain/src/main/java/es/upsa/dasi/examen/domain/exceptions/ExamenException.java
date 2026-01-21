package es.upsa.dasi.examen.domain.exceptions;

public class ExamenException extends  Exception{
    public ExamenException() {
    }

    public ExamenException(String message) {
        super(message);
    }

    public ExamenException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExamenException(Throwable cause) {
        super(cause);
    }

    public ExamenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
