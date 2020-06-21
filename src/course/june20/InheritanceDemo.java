package course.june20;

public class InheritanceDemo {

    public static void main(String[] args) {
        QA qa = new QA();
        Dev dev = new Dev();

        qa.print();
        qa.printAbstract();

        dev.print();
        dev.printAbstract();



//        System.out.println(qa.getFirstName() + " " + qa.getLastName() + " " + qa.getPosition());
//        ((QA) qa).check();
//
//        System.out.println(dev.getFirstName() + " " + dev.getLastName() + " " + dev.getPosition());
//        ((Dev) dev).check();
//
//        System.out.println(((Dev) dev).getLanguage());
//
//        ((Dev) dev).setLanguage("Java");
//
//        System.out.println(((Dev) dev).getLanguage());
//
//        //Print printQA = new QA("a", "b", "c");
//        //Print printDev = new Dev("d", "e", "f");
//
//        ((QA) qa).print();
//        ((Dev) dev).print();

    }
}
