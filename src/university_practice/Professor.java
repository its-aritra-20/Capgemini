package university_practice;

public class Professor extends Person{
	private String specialization;
	Professor(String name, int age , String specialization){
		super(name,age);
		setSpecialization(specialization);
	}
	public void setSpecialization(String specialization) {
		this.specialization=specialization;
	}
	public String getSpecialization() {
		return this.specialization;
	}
	
	public void displayProfessorInfo() {
		displayInfo();
		System.out.println(" Specialization: "+getSpecialization());
	}
	}
