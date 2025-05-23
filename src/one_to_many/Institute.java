package one_to_many;

import java.util.List;

public class Institute {
	private String instituteName;
	private List<Department> departments;

	public Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
		this.departments=departments;
	}

	public void addDepartment(Department department) {
		departments.add(department);

	}

	public int getTotalStudentsInstitute() {
		int noOfStudents = 0;
		List<Student> students =null;;
		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}

}
