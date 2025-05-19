package university_practice;

public class Student extends Person{
	private int studentId;
	Student(String name, int age, int studentId){
		super(name,age);
		setStudentId(studentId);
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public void displayStudentInfo() {
		displayInfo();
		System.out.println(" StudentId: "+getStudentId());
	}
	
}
