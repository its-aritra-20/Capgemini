package many_to_many;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int userId;
	private String name;
	List<User> friends;
	List<Groups> groups;
	User(int userId,String name){
		this.userId=userId;
		this.name=name;
		this.friends=new ArrayList<User>();
		this.groups=new ArrayList<Groups>();
	}
	
	
	public void addFriend(User friend) {
		if(this.friends.contains(friend)) {
			System.out.println("Existing friend , can't add");
			return;
		}
		this.friends.add(friend);
		friend.friends.add(this);
		System.out.println("Added");
	}
	
	public void joinGroup(Groups group) {
		if(group.members.contains(this)) {
			System.out.println("Already added");
		}
		
		group.members.add(this);
		groups.add(group);	
		
	}
	
	public void leaveGroup(Groups group) {
		if(!group.members.contains(this)) {
			System.out.println("Not exist");
		}
		else {
			groups.remove(group);
			group.members.remove(this);
		}
	}
	
	
	
		

}
