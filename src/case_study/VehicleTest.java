package case_study;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda", 0);
        Vehicle bike = new Bike("Yamaha", 0);
        Vehicle truck = new Truck("Volvo", 0);

        car.start();
        car.accelerate(30);
        car.brake(10);
        car.displayType();
        car.stop();

        System.out.println();

        bike.start();
        bike.accelerate(50);
        bike.brake(20);
        bike.displayType();
        bike.stop();

        System.out.println();

        truck.start();
        truck.accelerate(40);
        truck.brake(15);
        truck.displayType();
        truck.stop();
    }
}