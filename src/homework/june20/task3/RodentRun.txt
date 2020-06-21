package homework.june20.task3;

/*3. Modify exercise 2 so that it demonstrates the order of initialization
of the base classes and derived classes. Now add member objects to both the base and derived classes,
and show the order in which their initialization occurs during construction.*/
public class RodentRun {
    public static void main(String[] args) {

        Rodent rodent = new Rodent(120, 6, Gender.MALE);
        System.out.println();

        Mouse mouse = new Mouse(100, 7, Gender.FEMALE);
        System.out.println();

        Gerbil gerbil = new Gerbil(150,8, Gender.MALE);
        System.out.println();

        Hamster hamster = new Hamster(90,5, Gender.FEMALE);
        System.out.println();

        Rodent[] rodents = {rodent, mouse, gerbil, hamster};

        for(Rodent r : rodents){
            r.searchFood();
            r.eat();
            r.sleep();
        }
    }
}
