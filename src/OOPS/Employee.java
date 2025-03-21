package OOPS;

public class Employee {
	int emp_id;
	String name;
	String companyName;
	double salary;
	
	public Employee(int emp_id) {
		this.emp_id=emp_id;
		
	}
	public Employee(int emp_id,String name) {
		this(emp_id);
		this.name=name;
	}
	public Employee(int emp_id,String name,String companyName) {
		this(emp_id,name);
		this.companyName=companyName;
	}
	public Employee(int emp_id,String name,String companyName,double salary) {
		this(emp_id,name,companyName);
		this.salary=salary;
	}
	
	public void getter() {
		System.out.println(this.emp_id);
		System.out.println(this.name);
		System.out.println(this.companyName);
		System.out.println(this.salary);
	}
	
}
