package homework.june20.task5;

public class Honda extends Car {
    public Honda(String model, Fuel fuel, int maxSpeed) {
        super(model ,fuel, maxSpeed);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda is starting the engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Honda is stopping the engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Honda is slowing down");
    }
}
