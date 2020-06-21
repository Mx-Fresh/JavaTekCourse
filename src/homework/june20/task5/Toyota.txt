package homework.june20.task5;

public class Toyota extends Car {
    public Toyota(String model, Fuel fuel, int maxSpeed) {
        super(model, fuel, maxSpeed);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota is starting the engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Toyota is stopping the engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Toyota is slowing down");
    }
}
