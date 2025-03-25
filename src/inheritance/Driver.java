package inheritance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike("DAVID PUTRA", "2000cc");
		Car car = new Car("Maruti Omni", "800cc", 100000);
		bike.display();
		car.display();
		System.out.println(car.price);
		// bike.display();
	}

}
