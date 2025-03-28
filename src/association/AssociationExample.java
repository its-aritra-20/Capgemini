package association;

import java.util.HashSet;
import java.util.Set;

public class AssociationExample {
	public static void main(String[] args) {
		Employee e1=new Employee("Honu");
		Employee e2=new Employee("Aritra");
		Set<Employee> employees=new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		
		
		Bank bank=new Bank("HDFC");
		bank.setEmployees(employees);
		for(Employee emp: bank.getEmployees()) {
			System.out.println(emp.getEmployeeName()+" belongs to bank "+bank.getbBankName());
		}
	}
}
