package flight_practice;

public class Passenger {
	private String name;
	Passenger(String name){
		setName(name);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "Poor Economy "+getName();
	}
}
