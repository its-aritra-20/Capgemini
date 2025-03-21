package OOPS;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1=new Employee(1);
		Employee e2=new Employee(2, "Kanchana");
		Employee e3=new Employee(3,"Shyam","Iliyas er Bari");
		Employee e4=new Employee(4,"Kachra Seth","Hera Pheri",150);
		e1.getter();
		e2.getter();
		e3.getter();
		e4.getter();
		
		
	}

}
