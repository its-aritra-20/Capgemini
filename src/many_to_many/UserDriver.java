package many_to_many;

public class UserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User(1,"Honu");
		User u2=new User(2,"Kacha Aam");
		User u3=new User(3,"Pedophile");
		Groups g1=new Groups(100,"Capgemini eliminated guys");
		u1.addFriend(u2);
		u2.addFriend(u3);
		u1.joinGroup(g1);
		u3.joinGroup(g1);
		u1.removeFriend(u1);
		u1.displayFriends();
	}

}
