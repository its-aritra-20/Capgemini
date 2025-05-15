package event_ticket_booking_system;

public class Ticket {
	private Attendee attendee;
	private Event event;
	protected String status;
	Ticket(Attendee attendee,Event event){
		this.attendee=attendee;
		this.event=event;
		status="Booked";
	}
	
	public void cancel() {
		status="Cancelled";
	}
	public String getStatus() {
		return status;
	}
	public String ticketDetails() {
		return "Ticket for "+event.getTitle()+" , Status : "+status+" , Attendee :"+attendee.name;
	}
	
}
