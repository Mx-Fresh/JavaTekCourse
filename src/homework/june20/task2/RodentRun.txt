package homework.june20.task2;

public class RodentRun {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(100, 7, Gender.FEMALE),
                new Gerbil(150,8, Gender.MALE),
                new Hamster(90,5, Gender.FEMALE)
        };

        for(Rodent rodent : rodents){
            rodent.searchFood();
            rodent.eat();
            rodent.sleep();
        }
    }
}
