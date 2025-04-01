package case_study;


class Car extends AbstractVehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }

    public void start() {
        System.out.println(name + " car started.");
    }

    public void stop() {
        System.out.println(name + " car stopped.");
    }

    public void displayType() {
        System.out.println("This is a Car.");
    }
}

