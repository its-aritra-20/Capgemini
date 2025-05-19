package tree_set;

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee e) {
		return this.salary-e.salary;
	}
	
	
}
