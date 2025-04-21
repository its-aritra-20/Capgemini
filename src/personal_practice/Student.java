package personal_practice;

import java.util.Scanner;

public class Student {
	private String name;
	public static Scanner sc=new Scanner(System.in);
	private int rollNo;
	private double cgpa;
	public void setName(String name) {
		this.name=name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public void setCgpa(double cgpa) {
		if(cgpa>=0.0 && cgpa<=10.0) {
		this.cgpa=cgpa;
		return;
		}
		System.out.println("CGPA cannot be set to a value greater than 10.0 or less than 0.0");
		System.out.println("CGPA:");
		setCgpa(sc.nextDouble());
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public double getCgpa() {
		return cgpa;
	}
}
