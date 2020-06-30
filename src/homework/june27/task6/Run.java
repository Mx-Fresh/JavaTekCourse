package homework.june27.task6;

/*6.Repeat the previous exercise,
but inside the catch clause, wrap g( )’s exception in a RuntimeException.*/

public class Run {

    public static void main(String[] args) {

        System.out.println("Invoke g(): ");

        try {
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Invoke f(): ");
        try {
            f();
        } catch (Exception fe) {
            fe.printStackTrace();
        }
    }

    public static void g() throws Exception{
        try {
            throw new GException();
        } catch (GException e) {
            throw new RuntimeException();
        }
    }

    public static void f() throws Exception {
        try{
            g();
        } catch (Exception e) {
            throw new FException("FEException occurred", e);
        }

    }

}
