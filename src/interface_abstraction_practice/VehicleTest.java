package interface_abstraction_practice;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractVehicle v=new Car("Ferrari",60);
		AbstractVehicle u=new Bike("BMW",40);
		v.start();
		v.getSpeed();
		u.accelerate(35);
		u.getSpeed();
		u.stop();
		u.getSpeed();
		AbstractVehicle w=new Truck("Lorrie",69);
		w.getCurrentSpeed();
		u.getCurrentSpeed();
		v.getCurrentSpeed();
		
	}

}
