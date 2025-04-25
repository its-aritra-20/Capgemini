package exception_handling_case_study;

import java.util.Scanner;

public class AtmDemo {
	private int balance;
	private int pin;
	public static Scanner sc=new Scanner(System.in);
	AtmDemo(int balance,int pin){
		this.balance=balance;
		this.pin=pin;
	}
	public int getBalance() {
		return balance;
	}
	
	public int getPin() {
		return pin;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	
	public void withdraw(int amount) throws InsufficientBalanceException{
		if(amount>this.balance) {
			throw new InsufficientBalanceException("Withdrawal amount exceeds balance");
			
		}
		else {
			this.balance-=amount;
			System.out.println("Withdrawal successful, New Balance : "+this.balance);
		}
	}
	
	public void checkPin(int pin) throws PinWrongException,InsufficientBalanceException{
		if(pin!= this.pin) {
			throw new PinWrongException("Wrong pin, try again");
		}
		else {
			System.out.println("Log in successful");
			System.out.println("Enter the amount you want to withdraw");
			
			withdraw(sc.nextInt());
		
				
		}
	}
	
	
}
