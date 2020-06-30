package homework.june27.task7;

public class AException extends Exception {

    public AException(){
        super("AException occurred");
    }

    public AException(String message){
        super(message);
    }

    public AException(String message, Throwable throwable){
        super(message, throwable);
    }

    public AException(Throwable throwable) {super(throwable);}

}
