package event_ticket_booking_system;

public abstract class User {
	protected String id;
	protected String name;
	User(String id, String name){
		this.id=id;
		this.name=name;
	}
	
	
	abstract void showProfile();
}
