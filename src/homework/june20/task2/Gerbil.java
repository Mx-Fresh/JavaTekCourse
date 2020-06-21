package homework.june20.task2;

public class Gerbil extends Rodent {

    public Gerbil(int weight, int length, Gender gender) {
        super(weight, length, gender);
    }

    @Override
    public void searchFood() {
        System.out.println("Gerbil is searching for food");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil is sleeping");
    }

}
