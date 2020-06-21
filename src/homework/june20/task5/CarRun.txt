package homework.june20.task5;

public class CarRun {

    public static void main(String[] args) {
        Car honda = new Honda("Accord", Fuel.GASOLINE, 240);
        testDrive(honda);
        System.out.println();

        Car subaru = new Subaru("Forester", Fuel.DIESEL, 190);
        testDrive(subaru);
        System.out.println();

        Car toyota = new Toyota("Prius+", Fuel.ELECTRICITY, 220);
        testDrive(toyota);

    }

    public static void testDrive(Car car) {
        car.showSpecs();
        car.startEngine();
        car.accelerate();
        car.brake();
        car.stopEngine();
    }
}
