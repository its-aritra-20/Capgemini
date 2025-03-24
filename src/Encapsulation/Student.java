package Encapsulation;

import java.util.Scanner;

public class Student {
	private String email = "123";
	private String password = "123";
	private String name = "RAJ";
	private String gender = "male";
	private int age = 21;
	private String branch = "CSE";
	

	public void setPassword(String password, String email) {
		if (this.email.equals(email) && this.password.equals(password)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter newpassword");
			String newpassword = sc.nextLine();
			System.out.println("enter confirm password");
			String confirmpassword = sc.nextLine();
			if (newpassword.equals(confirmpassword)) {
			this.password=newpassword;
			} else {
				System.out.println("two passwords are not the same");
			}

		} else {
			System.out.println("INVALID LOGIN CREDENTIALS");
		}
	}

	public void setName(String email, String password) {
		if (this.email.equals(email) && (this.password.equals(password))) {
			Scanner sc = new Scanner(System.in);
		this.name=sc.nextLine();
		} else {
			System.out.println("INVALID LOGIN CREDENTIALS");
		}
	}

	public void setGender(String email, String password) {
		if (this.email.equals(email) && (this.password.equals(password))) {
			Scanner sc = new Scanner(System.in);
		this.gender=sc.nextLine();
		} else {
			System.out.println("INVALID LOGIN CREDENTIALS");
		}
	}

	
	public void setAge(String email, String password) {
		if (this.email.equals(email) && (this.password.equals(password))) {
			Scanner sc = new Scanner(System.in);
			this.age=sc.nextInt();

		}
	}

public void setBranch(String email,String password) {
if (this.email.equals(email) && (this.password.equals(password))) {
	Scanner sc = new Scanner(System.in);
	this.branch=sc.nextLine();
}
else
{
	System.out.println("INVALID LOGIN CREDENTIALS");
}
}
public void getDetails(String email,String password) {
	if (this.email.equals(email) && (this.password.equals(password))) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(branch);
		System.out.println(gender);
		
	}
	else
	{
		System.out.println("INVALID LOGIN CREDENTIALS");
	}
}
}
