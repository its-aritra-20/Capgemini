package comparable_and_comparator;

public class Person implements Comparable {
	public String name;
	public int age;
	
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+" "+age;
	}
	@Override
	public int compareTo(Object o) {
		
		Person e=(Person)o;
		int nameCompare=this.name.compareTo(e.name);
		if(nameCompare!=0) {
			System.out.println("Name not matched");
			return nameCompare;
		}
		return Integer.compare(this.age, e.age);
	}
}
