package comparable_and_comparator;

import java.util.Arrays;

public class Dog implements Comparable{
	public String name;
	public int age;
	public String breed;
	Dog(String name,int age,String breed){
		this.name=name;
		this.age=age;
		this.breed=breed;
		
	}
	
	public int compareTo(Object o) {
		Dog d=(Dog)o;
	
		if(this.name.compareTo(d.name)!=0) {
			return this.name.compareTo(d.name);
		}
		if(this.age-d.age!=0) {
			return this.age-d.age;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age +" breed= "+breed+" ]";
	}
	
	

}
