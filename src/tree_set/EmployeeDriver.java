package tree_set;0

import java.util.TreeSet;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> employees=new TreeSet<Employee>(new CompareByName());
		employees.add(new Employee("Kacha Aam",150));
		employees.add(new Employee("Pedophile",17));
		employees.add(new Employee("Aritra the Great",10000000));
		
		System.out.println(employees);
		//employees.descendingSet();
		//System.out.println(employees);
	}

}
