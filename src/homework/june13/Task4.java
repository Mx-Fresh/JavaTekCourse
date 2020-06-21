package homework.june13;

//4) Implement a Java function that finds
// two neighboring numbers in an array with the smallest distance to each other.
public class Task4 {

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};

        printArray(arr1);
        System.out.println("The smallest distance between 1 & 2 in the arr1 is: "
                + minDistance(1,2,arr1));
        System.out.println("The smallest distance between 2 & 1 in the arr1 is: "
                + minDistance(2,1,arr1));

        printArray(arr2);
        System.out.println("The smallest distance between 1 & 9 in the arr2 is: "
                + minDistance(1,9,arr2));
        System.out.println("The smallest distance between 3 & 5 in the arr2 is: "
                + minDistance(3,5,arr2));
    }

    static int minDistance(int num1, int num2, int[] arr) {
        int minDist = arr.length - 1;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(((arr[i] == num1 && arr[j] == num2) || (arr[i] == num2 && arr[j] == num1))
                        && minDist > Math.abs(j - i)) {
                    minDist = Math.abs(j - i);
                }
            }
        }

        return minDist;
    }

    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
