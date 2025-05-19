package personal_practice;

public class PersonUse {
	private String name;
	private int age;
	PersonUse(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void displayStudents() {
		System.out.print(name+" "+age);
	}
	
}
