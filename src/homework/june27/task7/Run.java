package homework.june27.task7;

/*7.Create three new types of exceptions.
Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause
that will catch all three types of exceptions. Feedback*/

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        try {
            run.throwAllExceptions(3);
        } catch (AException | BException | CException e ) {
            e.printStackTrace();
        }
    }

    public void throwAllExceptions(int i) throws CException, BException, AException {
         switch (i){
             case 1: throw new AException();
             case 2: throw new BException();
             case 3: throw new CException();
         }
    }
}
