package event_ticket_booking_system;

public class Attendee extends User{
	Attendee(String name,String id){
		super(name,id);
	}
	public void showProfile() {
		System.out.println("Attendee Name : "+super.name+" Attendee id : "+super.id);
	}
}
