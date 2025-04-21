package hashset_collection;

import java.util.HashSet;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		set.add(new Student("Kacha Aaam",108));
		set.add(new Student("Pedophile",17));
		set.add(new Student("Pedophile",17));
		set.add(new Student("Turjo Das",17));
		System.out.println(set);
	}

}
