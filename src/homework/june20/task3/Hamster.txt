package homework.june20.task3;

public class Hamster extends Rodent {

    public Hamster(int weight, int length, Gender gender) {
        super(weight, length, gender);
        System.out.println("Hamster constructor was invoked");
    }

    @Override
    public void searchFood() {
        System.out.println("Hamster is searching for food");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping");
    }
}
