package homework.june27.task8;

/*8.Write code to generate and catch an ArrayIndexOutOfBoundsException.*/
public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try{
            arr[10] = 10;
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }finally {
            System.out.println("ArrayIndexOutOfBoundsException was generated successfully");
        }
    }
}
