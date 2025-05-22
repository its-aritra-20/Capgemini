package bank_management_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private String name;
	private String accountNumber;
	private double balance;
	private String pin;
	List<Bank> banks;
	ArrayList<String> transactionHistory;

	public Customer(String name, String accountNumber, double balance, String pin) {

		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
		banks=new ArrayList<>();
		transactionHistory=new ArrayList<>();
	}
	
	public void addBank(Bank bank) {
		banks.add(bank);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	

	public void viewBalance() {
		System.out.println("Customer name : " + getName() + " Account Number : " + getAccountNumber() + " Balance : "
				+ getBalance());

	}

	public boolean authenticate(String enteredPin) {
		if (getPin().equals(enteredPin)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Customer name = " + name + ", Account Number= " + accountNumber + " , Balance = Rs. " + balance ;
	}
	

}
