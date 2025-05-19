package flight_practice;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	private String flightNumber;
	private List<Passenger> passengers;
	
	Flight(String FlightNumber){
		setFlightNumber(FlightNumber);
		this.passengers=new ArrayList<Passenger>();
	}
	public void setFlightNumber(String FlightNUmber) {
		this.flightNumber=flightNumber;
	}
	
	public void addPassenger(Passenger passenger) {
		this.passengers.add(passenger);
	}
	
	public void showPassengers() {
		System.out.println(passengers);
	}
	
}
