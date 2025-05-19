package comparable_and_comparator;

public class Employee implements Comparable<Employee> {
    public int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

    // Comparing based on name (natural ordering)
    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }
    
    public double compareSalary(Employee e1, Employee e2) {
    	return Double.compare(e1.salary, e2.salary);
    }
}
