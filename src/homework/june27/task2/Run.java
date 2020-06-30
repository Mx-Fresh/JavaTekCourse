package homework.june27.task2;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        while(true) {
            System.out.println("Enter a number between 1 and 10, or -1 to exit:");
            number = scanner.nextInt();

            if(number >= 1 && number <= 10) {
                System.out.println("You entered: " + number);
            } else if(number == -1) {
                continue;
            } else {
                try {
                    throw new MyException("Wrong number");
                } catch (MyException e) {
                    e.printMessage();
                }
            }

        }
    }
}
