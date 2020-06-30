package homework.june27.task6;

public class FException extends Exception {

    public FException() {
        super("FException occurred");
    }

    public FException(String message, Throwable t) {
        super(message,t);
    }
}
