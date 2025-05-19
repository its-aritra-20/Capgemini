package personal_practice;

public class PartTimeEmployee extends Employee{
	private int workingHours;
	PartTimeEmployee(String name, int salary,int workingHours){
		super(name,salary);
		this.workingHours=workingHours;
		
	}
	public void partTimeEmployeeInfo() {
		super.employeeInfo();
		System.out.print(" "+workingHours);
	}
}
