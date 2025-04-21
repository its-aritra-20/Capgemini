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
		System.out.println(friend.name+" is Added to "+this.name+" friend list");
	}
	
	public void joinGroup(Groups group) {
		if(group.members.contains(this)) {
			System.out.println("Already added");
		}
		
		group.members.add(this);
		System.out.println(this.name+" is added to the group");
		groups.add(group);
		System.out.println("You have joined "+group.getGroupName());
		
	}
	
	public void leaveGroup(Groups group) {
		if(!group.members.contains(this)) {
			System.out.println("Not exist");
		}
		else {
			groups.remove(group);
			System.out.println("You are no longer in this group "+group.getGroupName());
			group.members.remove(this);
			System.out.println(this.name +"is removed");
		}
	}
	
	public void removeFriend(User friend) {
		if(this.friends.contains(friend)) {
			this.friends.remove(friend);
			friend.friends.remove(this);
			System.out.println(this.name+" is not a friend of "+friend.name);
			return;
		}
		System.out.println("Friend not exists");
	}
	
	public void displayFriends() {
		for(User u:this.friends) {
			System.out.println(u);
		}
	}
	
	public String toString() {
		return this.name+" "+userId;
	}
	
	
	
		

}
