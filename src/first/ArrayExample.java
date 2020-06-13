package first;

public class ArrayExample {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[arr.length];
        for(int i = arr.length - 1; i>=0; i--){
            arr2[arr.length - i - 1] = arr[i];
        }

        for(int i: arr2){
            System.out.println(i);
        }

    }
}
