package homework.june27.task9;

/*7.Create three new types of exceptions.
Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause
that will catch all three types of exceptions. Feedback*/

import homework.june27.task7.AException;
import homework.june27.task7.BException;
import homework.june27.task7.CException;

/*9.Modify Exercise 7 by adding a finally clause.
Verify that your finally clause is executed,
even if a NullPointerException is thrown. Feedback*/

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        try {
            run.throwAllExceptions(null);
        } catch (AException | BException | CException e ) {
            e.printStackTrace();
        }finally {
            System.out.println("Finally block");
        }
    }

    public void throwAllExceptions(Integer i) throws CException, BException, AException {
         switch (i){
             case 1: throw new AException();
             case 2: throw new BException();
             case 3: throw new CException();
         }
    }
}
