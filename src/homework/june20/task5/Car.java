package homework.june20.task5;

public abstract class Car {

    private String model;
    private Fuel fuel;
    private int maxSpeed;

    public Car(String model, Fuel fuel, int maxSpeed) {
        this.model = model;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void showSpecs() {
        System.out.println("Car{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                ", maxSpeed=" + maxSpeed +
                '}');
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate();
    public abstract void brake();

}

enum Fuel {
    GASOLINE,
    GAS,
    DIESEL,
    ELECTRICITY
}

