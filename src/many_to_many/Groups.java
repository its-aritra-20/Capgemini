package many_to_many;

import java.util.ArrayList;
import java.util.List;

public class Groups {
	private int groupId;
	private String name;
	List<User> members;
	Groups(int groupId,String name){
		this.groupId=groupId;
		this.name=name;
		this.members=new ArrayList<User>();
	}
}
