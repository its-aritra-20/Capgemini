package flight_practice;

public class Pilot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight f=new Flight("A123");
		Passenger p=new Passenger("Kanchan");
		f.addPassenger(p);
		Flight g=new Flight("B456");
		VipPassenger q=new VipPassenger("Kanchan er Bou");
		g.addPassenger(q);
		f.showPassengers();
		g.showPassengers();
		
		

	}

}
