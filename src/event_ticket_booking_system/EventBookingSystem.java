package event_ticket_booking_system;

import java.util.ArrayList;
import java.util.List;

public class EventBookingSystem {
	private List<Attendee> attendees=new ArrayList<>();
	private List<Organizer> organizers=new ArrayList<>();
	private List<Ticket> tickets=new ArrayList<>();
	private List<Event> events=new ArrayList<>();
	
	public void registerUser(User user) {
		if(user instanceof Attendee) {
			attendees.add((Attendee)user);
		}
		else if(user instanceof Organizer) {
			organizers.add((Organizer)user);
		}
		System.out.println("User registered: " + user.name);
	}
	
	 public void addEvent(Event event) {
	        events.add(event);
	        System.out.println("Event added: " + event.getTitle());
	 }
	 public void bookTicket (String attendeeId, String eventTitle) throws InvalidTicketBookingException {
		 Attendee attendee=attendees.stream().filter(a -> a.id.equals(attendeeId)).findFirst().orElse(null);
	 }
	 
}
