package event_ticket_booking_system;

public class InvalidTicketBookingException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidTicketBookingException(String message) {
		super(message);
	}

}
