package covariant_returntype;

public class Employee {
	String name;
	double salary;
	
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void employeeInfo() {
		System.out.println(this.name+" "+this.salary);
	}
	public void jobRole() {
		System.out.println("Employee jobRole");
	}
}
