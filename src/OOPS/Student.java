package OOPS;

import java.util.Scanner;

public class Student {
	public static Scanner sc=new Scanner(System.in);
	String id;
	String name;
	String collegeName;
	int marks;
	
	// getter method
	public void Studying() {
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student College Name: "+collegeName);
		System.out.println("Student marks: "+marks);
	}
	// setter method
	public void setter() {
		System.out.println("Enter Id:");
		id=sc.nextLine();
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter College Name:");
		collegeName=sc.nextLine();
		System.out.println("Enter Marks:");
		marks=sc.nextInt();
	}

}
