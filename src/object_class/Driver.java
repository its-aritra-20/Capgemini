package object_class;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("100","Honu Sinha",10000);
		Employee e2=new Employee("100","Honu Sinha",50000);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		//Object e3=e1.clone();
		
		
	}

}
