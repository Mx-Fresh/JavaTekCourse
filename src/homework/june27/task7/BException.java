package homework.june27.task7;

public class BException extends Exception {
    public BException(){
        super("BException occurred");
    }

    public BException(String message){
        super(message);
    }

    public BException(String message, Throwable throwable){
        super(message, throwable);
    }

    public BException(Throwable throwable) {super(throwable);}

}
