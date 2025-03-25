package many_to_many;

public class Course {
	String Name;
	Student[] students;

	Course(String name, int size) {
		this.Name = name;
		this.students = new Student[size];
	}
}
