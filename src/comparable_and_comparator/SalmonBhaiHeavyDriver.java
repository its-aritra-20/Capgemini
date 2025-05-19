package comparable_and_comparator;

public class SalmonBhaiHeavyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Honu",13);
		Person p2=new Person("Honu",18 );
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		if(p1.compareTo(p2)==0) {
			System.out.println("Same age");
		}
		else if(p1.compareTo(p2)>0){
			System.out.println("Person 1 is older");
		}
		else {
			System.out.println("Person 2 is older");
		}
	}

}
