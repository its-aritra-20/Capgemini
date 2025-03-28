package one_to_many;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {
	public static void main(String args[]) {
		Student s1=new Student("Parul",1);
		Student s2 = new Student("Sachin", 2);
        Student s3 = new Student("Priya", 1);
        Student s4 = new Student("Rahul", 2);
        
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
        
        List<Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);
        
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
        
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
        
        Institute institute = new Institute("BITS", departments);
        
        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInstitute());
	}
}
