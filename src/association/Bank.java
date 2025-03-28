package association;

import java.util.Set;

public class Bank {
	private String bankName;
	private Set<Employee> employees;
	
	public Bank(String bankName) {
		this.bankName=bankName;
	}
	public String getbBankName() {
		return this.bankName;
	}
	
	public void setEmployees(Set<Employee> employees) {
		this.employees=employees;
	}
	
	public Set<Employee> getEmployees(){
		return this.employees;
	}
}
