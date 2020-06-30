package homework.june27.task2;

/*2.Create your own exception class using the extends keyword.
Write a constructor for this class that takes a String argument
and stores it inside the object with a String reference.
Write a method that prints out the stored String.
Create a try-catch clause to exercise your new exception. Feedback*/

public class MyException extends Exception{
    private String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }




}
