package case_study;

class Truck extends AbstractVehicle {
    public Truck(String name, int speed) {
        super(name, speed);
    }

    public void start() {
        System.out.println(name + " truck started.");
    }

    public void stop() {
        System.out.println(name + " truck stopped.");
    }

    public void displayType() {
        System.out.println("This is a Truck.");
    }
}