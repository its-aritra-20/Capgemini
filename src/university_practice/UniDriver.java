package university_practice;

public class UniDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University u=new University(2);
		Person p1=new Student("Honu",50,69);
		u.addPerson(p1);
		Person p2=new Professor("Monu",21,"Hola");
		u.addPerson(p2);
		u.showPeople();
		

	}

}
