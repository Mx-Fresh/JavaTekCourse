package homework.june13;

//1) Implement the bubble sort.
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4,8,9,7,6};
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //Print the sorted array
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
