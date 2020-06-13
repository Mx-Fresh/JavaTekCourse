package first;

public class Persoana {

    int age;
    String name;
    String job;

    @Override
    public String toString() {
        return "Persoana{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public Persoana(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public static void main(String[] args) {
        Persoana persoana = new Persoana(30, "Andrei", "qa");
        //persoana.age=20;
        System.out.println(persoana);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i = arr.length - 1; i<0; i--){ System.out.println(arr[i]);}
    }
}
