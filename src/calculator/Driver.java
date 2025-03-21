package calculator;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Add \n2.Subtract \n3.Multiply \n4.Division \n0 to exit ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		switch(input) {
		case 1:
			Calculate.addMenu();
			break;
		case 2:
			Calculate.subMenu();
			break;
		case 3:
			Calculate.mulMenu();
			break;
		case 4:
			Calculate.divMenu();
			break;
		default:
			System.out.println("Invalid input");
			break;
			
		}
		
		
		
		
		sc.close();

	}

}
