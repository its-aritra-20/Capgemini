package object_class;

public class Employee implements Cloneable{
	private String emp_id;
	private String emp_name;
	private int salary;
	public Employee(String emp_id,String emp_name,int salary) {
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}
	public boolean equals(Object o) {
		if(o instanceof Employee) {
		Employee e=(Employee)o;
		return this.emp_id==e.emp_id &&this.salary==e.salary && this.emp_name.equals(e.emp_name) ;
		}
		return false;
	}
	
	public int hashCode() {
		return (int)(this.salary);
	}
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//	public String toString() {
//		System.out.println(emp_id+" "+emp_name+" "+salary);
//		return " ";
//	}
	
}
