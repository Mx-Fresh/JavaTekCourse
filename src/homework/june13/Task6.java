package homework.june13;

import java.util.Arrays;

//6) Create a copy of an array using different methods:
//      1. using for loop
//      2. System.arraycopy()
//      3. Arrays.copyOf() for primitive types
//      4. Object.clone() for primitive types
//      5. Stream API - Arrays.stream(array).toArray()
public class Task6 {

    public static void main(String[] args) {

        //1. using for loop:
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //check the result:
        for(int i : arr2) { System.out.print(i + " "); }

        arr2[0] = 9;
        System.out.println(arr2[0]==arr1[0]);


        //2. System.arraycopy():
        int[] arr3 = {4,5,6};
        int[] arr4 = new int[arr3.length];

        System.arraycopy(arr3, 0, arr4, 0, arr4.length);

        //check the result:
        for(int i : arr4) { System.out.print(i + " "); }

        arr4[0] = 9;
        System.out.println(arr4[0] == arr3[0]);


        //3. Arrays.copyOf():
        int[] arr5 = {7,8,9};
        int[] arr6 = Arrays.copyOf(arr5, arr5.length);

        //check the result:
        for(int i : arr6) { System.out.print(i + " "); }

        arr6[0] = 9;
        System.out.println(arr6[0] == arr5[0]);

        //4. Object.clone():
        int[] arr7 = {0,1,2};
        int[] arr8 = arr7.clone();

        //check the result:
        for(int i : arr8) { System.out.print(i + " "); }

        arr8[0] = 9;
        System.out.println(arr8[0] == arr7[0]);

        //5. Stream API:
        int[] arr9 = {3,4,5};
        int[] arr10 = Arrays.stream(arr9).toArray();

        //check the result:
        for(int i : arr10) { System.out.print(i + " "); }

        arr10[0] = 9;
        System.out.println(arr10[0] == arr9[0]);
    }
}
