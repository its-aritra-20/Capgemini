package case_study;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University university=new University(3);
		Student s1=new Student("Honu",20,200);
		Student s2=new Student("Riyan Parag",5,7);
		Professor p1=new Professor("John Wick",109,"Pencil");
		s1.displayInfo();
		s2.displayInfo();
		p1.displayInfo();
	}

}
