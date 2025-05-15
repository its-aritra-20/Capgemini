package event_ticket_booking_system;

public class Event {
	protected String title;
	protected int availableTickets;
	Event(String title, int availableTickets){
		this.title=title;
		this.availableTickets=availableTickets;
	}
	
	
	public String getTitle() {
		return title;
	}



	public boolean isAvailable() {
		if(availableTickets>0) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public void setAvailableTickets(int ticket) {
		availableTickets=ticket;
	}
}
