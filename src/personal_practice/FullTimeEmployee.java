package personal_practice;

public class FullTimeEmployee extends Employee{
	private int bonus;
	FullTimeEmployee(String name,int salary,int bonus){
		super(name,salary);
		this.bonus=bonus;
	}
	public void fullTimeEmployeeInfo() {
		super.employeeInfo();
		System.out.print(" "+bonus);
	}
	
}
