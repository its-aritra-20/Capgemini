package reflection_api;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private int age;
	
	Employee(int id,String name,int salary,int age){
		setName(name);
		setAge(age);
		setId(id);
		setSalary(salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
}
