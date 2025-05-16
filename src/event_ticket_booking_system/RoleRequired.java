package event_ticket_booking_system;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RoleRequired {
	String role();
}
