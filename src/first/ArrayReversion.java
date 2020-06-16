package first;

public class ArrayReversion {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int[] arr2 = new int[arr.length];

        for(int i = arr.length - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
            arr2[arr.length - i - 1] = arr[i];
        }

        System.out.println();

        for(int i: arr2){
            System.out.print(i + " ");
        }

    }
}
