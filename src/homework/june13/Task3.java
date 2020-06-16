package homework.june13;

import java.util.Arrays;

//3) Create a Java code to find duplicate elements in an String array,
// then create an array that contains all duplicates
// and one that does not contain duplicates.
public class Task3 {
    public static void main(String[] args) {

        String[] arr = {"a", "a", "b", "a",
                "c", "b", "d", "d"};

        Arrays.sort(arr);

        //Print initial array sorted alphabetically
        System.out.print("Initial array (sorted): ");
        printArray(arr);

        //Search for duplicates and then create a new array with unique values only
        String[] uniqueArr = getUniqueValues(arr);
        System.out.print("Array with unique values: ");
        printArray(uniqueArr);

        //Create a new array with duplicates
        String[] duplicatesArr = getDuplicateValues(arr);
        System.out.print("Array with all duplicates: ");
        printArray(duplicatesArr);

    }

    static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    static int getNumberOfDuplicates(String[] arr) {
        int numberOfDuplicates = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                System.out.println("arr[" + (i + 1)  + "] : " + arr[i + 1]);
                numberOfDuplicates++;
            }
        }
        System.out.println("Number of duplicates found: " + numberOfDuplicates + "\n");

        return numberOfDuplicates;
    }

    static String[] getUniqueValues(String[] arr) {

        if(arr.length == 0 || arr.length==1) {
            return arr;
        }

        String[] uniqueValArr = new String[arr.length - getNumberOfDuplicates(arr)];

        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (!arr[i].equals(arr[i + 1])) {
                uniqueValArr[j++] = arr[i];
            }
        }

        uniqueValArr[j] = arr[arr.length - 1];

        return uniqueValArr;
    }

    static String[] getDuplicateValues(String[] arr) {

        if(arr.length == 0 || arr.length==1) {
            return arr;
        }

        String[] tempArr = new String[arr.length];

        int j = 0;

        if (arr[0].equals(arr[1])) {
            tempArr[j++] = arr[0];
        }

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i].equals(arr[i + 1]) || arr[i].equals(arr[i - 1])) {
                tempArr[j++] = arr[i];
            }
        }

        if (arr[arr.length - 1].equals(arr[arr.length - 2])) {
            tempArr[j++] = arr[arr.length - 1];
        }

        String[] duplicateValArr = new String[j];
        for(int i = 0; i < j; i++) {
            duplicateValArr[i] = tempArr[i];
        }

        return duplicateValArr;
    }

}
