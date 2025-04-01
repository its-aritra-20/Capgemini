package case_study;

abstract class AbstractVehicle implements Vehicle {
    protected String name;
    protected int speed;

    public AbstractVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(name + " accelerated. Current speed: " + speed);
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println(name + " applied brake. Current speed: " + speed);
    }

    public int getCurrentSpeed() {
        return speed;
    }

    public void displayDetails() {
        System.out.println("Vehicle: " + name + ", Speed: " + speed);
    }
}
