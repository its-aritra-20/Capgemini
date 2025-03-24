package one_to_many;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Customers");
		int size=sc.nextInt();
		Bank bank=new Bank(size,"SBI");
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 to add customers");
			System.out.println("Enter 2 to display customers");
			System.out.println("Enter 3 to exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					sc.nextLine();
					System.out.println("Enter the customer name:");
					String name=sc.nextLine();
					Customer customer=new Customer(name);
					bank.addCustomer(customer);
					break;
				case 2:
					bank.displayCustomers();
					break;
				case 3:
					flag=false;
					break;
			}
		}
	}

}
