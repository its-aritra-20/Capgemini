package event_ticket_booking_system;

import java.util.Iterator;
import java.util.List;

@RoleRequired(role="Admin")
public class Admin extends User{
	Admin(String name,String id){
		super(name,id);
	}
	public void removeEvent(List<Event> events, String title) {
		Iterator<Event> iterator=events.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getTitle().equals(title)) {
				iterator.remove();
				System.out.println("Event removed "+ title);
				return;
			}
		}
		System.out.println("Event not found.");
	}
	@Override
    public void showProfile() {
        System.out.println("Admin ID: " + id + ", Name: " + name);
    }
}
