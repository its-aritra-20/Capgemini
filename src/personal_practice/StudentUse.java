package personal_practice;

public class StudentUse extends PersonUse{
	private int id;
	StudentUse(int id,String name,int age){
		super(name,age);
		this.id=id;
	}
	public void displayStudentDetails(){
		super.displayStudents();
		System.out.print(" "+id);
	}
}
