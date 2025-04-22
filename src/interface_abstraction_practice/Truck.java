package interface_abstraction_practice;

public class Truck extends AbstractVehicle{

	Truck(String name,int speed){
		super.setName(name);
		super.setSpeed(speed);
	}
	public void displayDetails() {
		System.out.println("Name: "+super.getName()+" Speed: "+this.getSpeed());
	}
	
	public void start() {
		super.setSpeed(0);
		System.out.println("Name: "+this.getName()+" started");
	}
	
	public void stop() {
		super.setSpeed(0);
		System.out.println("Name: "+this.getName()+" stopped");
	}
	public void accelerate(int increment) {
		int newSpeed=increment+super.getSpeed();
		setSpeed(newSpeed);
		System.out.println("Current speed of "+super.getName()+" is "+super.getSpeed());
		
	}
	public void brake(int decrement) {
		int newSpeed=Math.max(0, decrement+super.getSpeed());
		super.setSpeed(newSpeed);
		System.out.println("Current speed of "+super.getName()+" is "+super.getSpeed());
	}
	
	public void getCurrentSpeed() {
		System.out.println(super.getSpeed());
	}
}
