package es.upsa.dasi.empresa.domain.exceptions;

public class ExamenRunTimeException extends  RuntimeException{
    public ExamenRunTimeException() {
    }

    public ExamenRunTimeException(String message) {
        super(message);
    }

    public ExamenRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExamenRunTimeException(Throwable cause) {
        super(cause);
    }

    public ExamenRunTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
