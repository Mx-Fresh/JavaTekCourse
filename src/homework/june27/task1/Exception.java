package homework.june27.task1;


/*1.Create a class with a main( ) that throws an object of class Exception inside a try block.
Give the constructor for Exception a String argument.
Catch the exception inside a catch clause and print the String argument.
Add a finally clause and print a message to prove you were there. Feedback*/

public class Exception {

    public static void main(String[] args) {

        try {
            System.out.println("Try block");
            throw new java.lang.Exception("An exception from try block");
        } catch (java.lang.Exception e) {
            System.out.println("Catch block");
            System.out.println(e.getMessage());
        } finally{

            System.out.println("finally block was executed successfully");
        }
    }
}
