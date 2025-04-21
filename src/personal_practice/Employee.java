package personal_practice;

public class Employee implements Comparable<Employee>{
	private String name;
	private double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public void employeeInfo() {
		System.out.print(name+" "+salary);
	}
	public int compareTo(Employee e) {
		return (int)(this.salary-e.salary);
	}
}
