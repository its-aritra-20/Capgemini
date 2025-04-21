package university_practice;

public class University {
	private Person[] people;
	static int limit;
	public University(int n) {
		this.people=new Person[n];
		limit=n;
	}
	static int count=0;
	
	
	public void addPerson(Person p) {
		if(count<limit) {
			people[count++]=p;
		}
		else {
			System.out.println("Limit exceeded");
		}
	}
	
	public void showPeople() {
		
		for(Person p:people) {
			if(p instanceof Professor) {
				
				((Professor)p).displayProfessorInfo();
			}
			if(p instanceof Student) {
				
				((Student)p).displayStudentInfo();
			}
		}
		
	}
	
	
	
	
}
