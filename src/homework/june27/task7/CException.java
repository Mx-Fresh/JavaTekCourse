package homework.june27.task7;

public class CException extends Exception {
    public CException(){
        super("BException occurred");
    }

    public CException(String message){
        super(message);
    }

    public CException(String message, Throwable throwable){
        super(message, throwable);
    }

    public CException(Throwable throwable) {super(throwable);}

}
