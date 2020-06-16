package homework.june13;
import java.util.Objects;

//10) Create a Java code and compare 2 Objects using == operator and equals method and try to achieve:
//    - objects should be equal by values but have different hash codes;
//    - objects should be equal by values but have same hash codes;
//    - objects should not be equal by values but have same hash codes;
//    - objects should not be equal by values but have different hash codes.


public class Task10 {

    public static void main(String[] args) {

        System.out.println("//    - objects should be equal by values but have different hash codes;");
        Object1 object11 = new Object1("object");
        Object1 object12 = new Object1("object");
        System.out.println("object11 == object12: " + (object11 == object12));
        System.out.println(object11.equals(object12));
        System.out.println(object11.hashCode());
        System.out.println(object12.hashCode());
        System.out.println();


        System.out.println("//    - objects should be equal by values but have same hash codes;");
        Object2 object21 = new Object2("object");
        Object2 object22 = new Object2("object");

        System.out.println(object21 == object22);
        System.out.println(object21.equals(object22));
        System.out.println(object21.hashCode());
        System.out.println(object22.hashCode());
        System.out.println();

        System.out.println("//    - objects should not be equal by values but have same hash codes;");
        Object3 object31 = new Object3("object");
        Object3 object32 = new Object3("object object");

        System.out.println("object31 == object32: " + (object31 == object32));
        System.out.println("object31.equals(object32): " + object31.equals(object32));
        System.out.println("object31.hashCode(): " + object31.hashCode());
        System.out.println("object32.hashCode(): " + object32.hashCode());
        System.out.println();

        System.out.println("//    - objects should not be equal by values but have different hash codes.");
        Object2 object23 = new Object2("object");
        Object2 object24 = new Object2("object object");
        System.out.println("object23 == object24: " + (object23 == object24));
        System.out.println("object23.equals(object24): " + object23.equals(object24));
        System.out.println("object23.hashCode(): " + object23.hashCode());
        System.out.println("object24.hashCode(): " + object24.hashCode());


    }

}

class Object1 {

    String name;

    public Object1(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Object1)) return false;
        Object1 object1 = (Object1) o;
        return Objects.equals(name, object1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name + Math.random());
    }


}

class Object2 {

        String name;

        public Object2(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Object2)) return false;
            Object2 object2 = (Object2) o;
            return Objects.equals(name, object2.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
}

class Object3 {

    String name;

    public Object3(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Object3)) return false;
        Object3 object3 = (Object3) o;
        return Objects.equals(name, object3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash("Object3");
    }

}
