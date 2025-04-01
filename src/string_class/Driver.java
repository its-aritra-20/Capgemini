package string_class;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Honu",10,'M',20.8);
		Student s1=new Student("Monu",20,'M',10.8);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.toString());
		System.out.println(s1.toString());
		}

}
