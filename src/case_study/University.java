package case_study;

public class University {
	private Person[] people;
	private int index=0;
	
	public University(int size) {
		people=new Person[size];
	}
	public void addPerson(Person p) {
		if(index<people.length) {
			people[index++]=p;
		}
		else {
			System.out.println("University is full , cannot add more people .");
		}
	}
	public void showPeople() {
		for(Person p: people) {
			if(p instanceof Student) {
				((Student)p).displayInfo();
			}
			else if(p instanceof Professor) {
				((Professor)p).displayInfo();
			}
			System.out.println();
		}
	}
}
