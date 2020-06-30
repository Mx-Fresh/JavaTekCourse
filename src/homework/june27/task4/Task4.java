package homework.june27.task4;

/*4.Define an object reference and initialize it to null.
Try to call a method through this reference.
Now wrap the code in a try-catch clause to catch the exception. Feedback*/

public class Task4 {
    public static void main(String[] args) {
        Object object = null;

        //object.toString(); //NullPointerException

        try{
            object.toString();
        }catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("The program was successfully executed");
    }
}
