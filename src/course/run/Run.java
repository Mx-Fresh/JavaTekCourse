package course.run;

import course.june20.Person;

public class Run {

    public static void main(String[] args) {
        Person person = new Person("Andrei", 30, "QA", true);
        System.out.println(person.toString());
    }
}
