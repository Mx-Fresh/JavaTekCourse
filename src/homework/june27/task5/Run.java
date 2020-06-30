package homework.june27.task5;


/*5.Create a class with two methods, f( ) and g( ). In g( ),
throw an exception of a new type that you define.
In f( ), call g( ), catch its exception and, in the catch clause,
throw a different exception (of a second type that you define).
Test your code in main( ). Feedback*/

public class Run {

    public static void main(String[] args) {

        System.out.println("Invoke g(): ");

        try {
            g();
        } catch (Exception ge) {
            ge.printStackTrace();
        }

        System.out.println("Invoke f(): ");
        try {
            f();
        } catch (Exception fe) {
            fe.printStackTrace();
        }
    }

    public static void g() throws Exception { throw new GException(); }

    public static void f() throws Exception{
        try{
            g();
        } catch (GException e) {
            throw new FException("FException occurred", e);
        }

    }

}
