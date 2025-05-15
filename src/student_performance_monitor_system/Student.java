package student_performance_monitor_system;

import java.util.List;
import java.util.Map;

public class Student {
	private String studentId;
	private String name;
	private String email;
	private String department;
	private List<Course> courses;
	private Map<Course, String> grades;
	private double gpa;

	public Student(String studentId, String name, String email, String department) {
		if(isValidEmail(email)) {
			throw new IllegalArgumentException("Invalid email format.");
		}
	}
}
