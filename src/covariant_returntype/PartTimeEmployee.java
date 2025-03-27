package covariant_returntype;

public class PartTimeEmployee extends Employee{
	private int workingHours;
	public PartTimeEmployee(String name, double salary , int workingHours) {
		super(name,salary);
		this.workingHours=workingHours;
		
	}
	public void employeeInfo() {
		super.employeeInfo();
		System.out.println("Working Hours: "+this.workingHours);
	}
	public void jobRole() {
		System.out.println("Part-Time Associate a cloud Engineer");
	}
	public void jobDesignation() {
		System.out.println("Associate");
	}
}
