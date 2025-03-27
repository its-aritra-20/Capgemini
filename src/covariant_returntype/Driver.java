package covariant_returntype;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new FullTimeEmployee("Honu", 1220, 123);  //Upcast
		e1.employeeInfo();
		((FullTimeEmployee)e1).jobRole();  //Downcast
		Employee e2=new PartTimeEmployee("Monu", 13132, 234);
		e2.employeeInfo();
		details(e1);

	}
	static void details(Employee e) {
		if(e instanceof FullTimeEmployee) {
			e.jobRole();
		}
		else {
			e.jobRole();
			((PartTimeEmployee)e).jobDesignation();
		}
	}
}
