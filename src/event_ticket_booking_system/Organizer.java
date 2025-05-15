package event_ticket_booking_system;

public class Organizer extends User{
	protected boolean active=true;
	Organizer(String name,String id){
		super(name,id);
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active=active;
	}
	public void showProfile() {
		System.out.println("Organizer Name : "+super.name+" Organizer id : "+super.id+" Active Status : "+isActive());
	}
}
