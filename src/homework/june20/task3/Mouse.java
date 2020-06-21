package homework.june20.task3;

public class Mouse extends Rodent {
    public Mouse(int weight, int length, Gender gender) {
        super(weight, length, gender);
        System.out.println("Mouse constructor was invoked");
    }

    @Override
    public void searchFood() {
        System.out.println("Mouse is searching for food");
    }

    @Override
    public void eat(){
        System.out.println("Mouse is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Mouse is sleeping");
    }
}
