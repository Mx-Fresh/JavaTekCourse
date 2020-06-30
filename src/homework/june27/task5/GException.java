package homework.june27.task5;

public class GException extends Exception {

    public GException() {
        super("GException occurred");
    }
    public GException(String message, Throwable t) {
        super(message, t);
    }
}
