package university_practice;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	public static Scanner sc=new Scanner(System.in);
	Person(String name, int age){
		setName(name);
		setAge(age);
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public void displayInfo() {
		System.out.println();
		System.out.print("Name: "+getName()+" Age: "+ getAge());
	}
	
	
	
}
