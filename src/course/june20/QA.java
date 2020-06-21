package course.june20;

public class QA extends AbstractClass implements Print {



//    public QA(String firstName, String lastName, String position) {
//        super(firstName, lastName, position);
//    }

    public void check() {
        System.out.println("Checking...");
    }

    @Override
    public void printAbstract() {
        System.out.println("Implementation od printAbstract() from QA");
    }

//    @Override
//    public void print() {
//        System.out.println("Hello from QA class");
//    }
}
