package flight_practice;

public class VipPassenger extends Passenger{
	private String name;
	VipPassenger(String name){
		super(name);
	}
	public String toString() {
		return "Business Economy "+getName();
	}
}
