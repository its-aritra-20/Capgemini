package interface_abstraction_practice;

public abstract class AbstractVehicle implements Vehicle{
	protected String name;
	protected int speed;
	protected abstract void displayDetails();
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getSpeed() {
		return speed;
	}
	protected void setSpeed(int speed) {
		this.speed = speed;
	} 
	protected abstract void getCurrentSpeed();
	
}
