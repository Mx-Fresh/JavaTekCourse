package homework.june20.task5;

public class Subaru extends Car {
    public Subaru(String model, Fuel fuel, int maxSpeed) {
        super(model, fuel, maxSpeed);
    }

    @Override
    public void startEngine() {
        System.out.println("Subaru is starting the engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Subaru is stopping the engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Subaru is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Subaru is slowing down");
    }
}
