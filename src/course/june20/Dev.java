package course.june20;

public class Dev extends AbstractClass implements Print{

    private String language;

//    public Dev(String firstName, String lastName, String position) {
//        super(firstName, lastName, position);
//    }
//
//    public Dev(String firstName, String lastName, String position, String language) {
//        super(firstName, lastName, position);
//        this.language = language;
//    }


    public void check() {
        System.out.println("Implementing a feature");
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public void printAbstract() {
        System.out.println("Implementation of printAbstract()");
    }

//    @Override
//    public void print() {
//        System.out.println("Hello from Dev class");
//    }
}
