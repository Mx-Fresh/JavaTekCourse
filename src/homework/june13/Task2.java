package homework.june13;

//2) Create a Java code what will display a Christmas tree.
//     *
//    ***
//   *****
//  *******
public class Task2 {
    public static void main(String[] args) {
        printChristmassTree(2);
        System.out.println();

        printChristmassTree(3);
        System.out.println();

        printChristmassTree(7);
        System.out.println();


    }

    static void printChristmassTree(int height) {
        for(int i = height; i >= 1; i--) {
            for(int j = 0; j < height * 2; j++) {
                if(j < i) {
                    System.out.print(" ");
                } else if (j >= i && j <= height * 2 - i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
