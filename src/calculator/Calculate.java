package calculator;

import java.util.Scanner;

public class Calculate {
	public static Scanner sc=new Scanner(System.in);
	public static void addMenu() {
		System.out.println("How many numbers do you want to add? ");
		//System.out.println(a+b);
		//Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
			case 2:
				System.out.println("Enter the numbers: ");
				double num1=sc.nextDouble();
				double num2=sc.nextDouble();
				add(num1,num2);
				break;
			case 3:
				double num11=sc.nextDouble();
				double num21=sc.nextDouble();
				double num3=sc.nextDouble();
				add(num11,num21,num3);
				break;
			default:
				System.out.println("Invalid input!");
				break;
			
		}
	}
	//add two numbers
	public static void add(double num1, double num2){
		System.out.println(num1+num2);
	}
	//add three numbers
	public static void add(double num1, double num2,double num3){
		System.out.println(num1+num2+num3);
	}
	
	public static void subMenu() {
		//System.out.println(a-b);
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1-num2);
	}
	public static void mulMenu() {
		System.out.println("How many numbers do you want to multiply? ");
	
		//Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 2:
			System.out.println("Enter the numbers: ");
			double num1=sc.nextDouble();
			double num2=sc.nextDouble();
			multiply(num1,num2);
			break;
		case 3:
			double num11=sc.nextDouble();
			double num21=sc.nextDouble();
			double num3=sc.nextDouble();
			multiply(num11,num21,num3);
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}
				
	}
	public static void multiply(double num1,double num2) {
		System.out.println(num1*num2);
	}
	public static void multiply(double num1,double num2,double num3) {
		System.out.println(num1*num2*num3);
	}
	
	public static void divMenu() {
		System.out.println("Enter the numbers :");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		if(num2==0) {
			System.out.println("Arithmetic Exception");
			return;
		}
		System.out.println(num1/num2);
		}
	
}
