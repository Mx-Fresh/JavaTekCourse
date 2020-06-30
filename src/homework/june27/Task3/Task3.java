package homework.june27.Task3;

import homework.june27.task2.MyException;

/*3.Write a class with a method that throws an exception of the type created in Exercise 2.
Try compiling it without an exception specification to see what the compiler says.
Add the appropriate exception specification.
Try out your class and its exception inside a try-catch clause. Feedback*/

public class Task3 {
    public static void main(String[] args) {

        String msg1 = "Message 1";
        String msg2 = "";

        try {
            print(msg1);
            print(msg2);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    //unreported exception MyException; must be caught or declared to be thrown
    public static void print(String msg) throws MyException{
        if("".equals(msg) || msg == null) {
            throw new MyException("The message was not provided");
        } else {
            System.out.println(msg);
        }
    }
}
