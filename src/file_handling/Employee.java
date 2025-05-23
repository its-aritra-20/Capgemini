package file_handling;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private int salary;
	
	Employee(int id,String name , int salary){
		setId(id);
		setName(name);
		setSalary(salary);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
