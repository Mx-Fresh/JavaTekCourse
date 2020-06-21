package homework.june20.task2;

/*
2. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
In the base class, provide methods that are common to all Rodents,
and override these in the derived classes to perform different behaviors
depending on the specific type of Rodent. Create an array of Rodent,
fill it with different specific types of Rodents,
and call your base-class methods to see what happens.
*/

public class Rodent {
    private int weight;
    private int length;
    private Gender gender;

    public Rodent(int weight, int length, Gender gender) {
        this.weight = weight;
        this.length = length;
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rodent{" +
                "weight=" + weight +
                ", length=" + length +
                '}';
    }

    public void searchFood() {
        System.out.println("Rodent is searching for food");
    }

    public void eat() {
        System.out.println("Rodent is eating");
    }

    public void sleep() {
        System.out.println("Rodent is sleeping");
    }

}

enum Gender {
    MALE,
    FEMALE
}