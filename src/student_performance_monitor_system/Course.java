package student_performance_monitor_system;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseCode;
	private String courseName;
	private int credit;
	private String instructor;
	private List<Student> studentsEnrolled;

	public Course(String courseCode, String courseName, int credit, String instructor) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.credit = credit;
		this.instructor = instructor;
		this.studentsEnrolled = new ArrayList<>();
	}

	public void enrollStudent(Student student) {
		studentsEnrolled.add(student);
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getCredit() {
		return credit;
	}

	public String getInstructor() {
		return instructor;
	}

	public List<Student> getStudentsEnrolled() {
		return studentsEnrolled;
	}

}
