package case_study;

class Bike extends AbstractVehicle {
    public Bike(String name, int speed) {
        super(name, speed);
    }

    public void start() {
        System.out.println(name + " bike started.");
    }

    public void stop() {
        System.out.println(name + " bike stopped.");
    }

    public void displayType() {
        System.out.println("This is a Bike.");
    }
}