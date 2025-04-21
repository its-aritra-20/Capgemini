package personal_practice;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner si=new Scanner(System.in);
		Student s=new Student();
		s.setName(si.nextLine());
		s.setRollNo(si.nextInt());
		s.setCgpa(si.nextDouble());
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
		System.out.println(s.getCgpa());
		

	}

}
