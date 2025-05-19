package lambdaexpressionmethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
public class EmployeeDriver {
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList();
		Comparator c=(o1,o2)->((Employee)o1).name.compareTo(((Employee)o2).name);
		//Comparator<Employee> c=(o1,o2)->o1.id-o2.id; this is same as the other used to compare based on ids
		employees.add(new Employee("AJ",1));
		employees.add(new Employee("AE",9));
		employees.add(new Employee("BY",6));
		employees.add(new Employee("TJ",3));
		Collections.sort(employees,c);
		System.out.println(employees);
		System.out.println("____________________________________________________________________________");
		Collections.sort(employees);
		System.out.println(employees);
	}

}
