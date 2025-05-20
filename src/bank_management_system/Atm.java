
package bank_management_system;

import java.util.Iterator;
import java.util.Scanner;

public class Atm {
	
	public static Scanner sc=new Scanner(System.in);
	private String location;
	private double cashAvailable;
	static int transactionId=100;

	public Atm(String location, double cashAvailable) {
		setLocation(location);
		setCashAvailable(cashAvailable);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getCashAvailable() {
		return cashAvailable;
	}

	public void setCashAvailable(double cashAvailable) {
		this.cashAvailable = cashAvailable;
	}
	
	public void processTransaction(Customer customer){
		System.out.println("Enter the pin : ");
		if(customer.authenticate(sc.next())) {
			menu(customer);
			return;
		}
		else {
			System.out.println("Authentication failed ! ");
			return;
		}
	}
	
	
	
	public void menu(Customer customer) {
		boolean flag=true;
		while(flag) {
			
		
			System.out.println(" 1. To deposit money \n 2. To withdraw money \n 3. To check balance \n 4. To display Transaction history \n 0. To exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				deposit(customer);
				break;
			case 2:
				withdraw(customer);
				break;
			case 3:
				System.out.println("Balance : "+ customer.getBalance());
				break;
			case 4:
				displayTransactionHistory(customer);
				break;
			case 0:
				flag=false;
				break;
			default:
				System.out.println("Invalid Input");
				
			}	
		}
		
		
	}
	
	public void deposit(Customer customer) {
		System.out.println("Enter the amount to deposit :");
		double amount=sc.nextDouble();
		customer.setBalance(amount+customer.getBalance());
		this.cashAvailable+=amount;
		System.out.println("Deposit succesful ! ");
		String history="Transaction Id : "+transactionId++ + " , Rs. "+amount +" has been deposited on Account Number : "+ customer.getAccountNumber() + " , New Balance : "+customer.getBalance();
		System.out.println(history);
		customer.transactionHistory.add(history);

	}
	
	public void withdraw(Customer customer) {
		System.out.println("Enter the amount to withdraw");
		double amount=sc.nextDouble();
		if(amount> customer.getBalance()) {
			System.out.println("Insufficient Balance ! ");
			return ;
		}
		customer.setBalance(customer.getBalance()-amount);
		this.cashAvailable-=amount;
		System.out.println("Withdrawal successful ! ");
		String history="Transaction Id : "+transactionId++ +" , Rs. "+amount +" has been withdrawn from Account Number : "+ customer.getAccountNumber() + " , New Balance : "+customer.getBalance();
		System.out.println(history);
		customer.transactionHistory.add(history);
	}
	
	
	public void displayTransactionHistory(Customer customer) {
		
		Iterator<String> itr=customer.transactionHistory.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
