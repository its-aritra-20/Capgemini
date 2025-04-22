package bank_management_system;

public class Account {
	private int accountNo;
	private int balance;
	
	Account(int accountNo,int balance){
		setAccountNo(accountNo);
		setBalance(balance);
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void deposit(int amount) {
		this.balance=this.balance+amount;
		System.out.println("Current Balance : "+getBalance());
	}
	public void withdrawala(int amount) {
		this.balance=this.balance+amount;
		System.out.println("Current Balance : "+getBalance());
	}
	
	
}
