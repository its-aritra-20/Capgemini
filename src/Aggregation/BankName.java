package Aggregation;

public class BankName {
	String accountNo;
	Customer cust;
	public BankName(String accoutNo, Customer cust) {
		this.accountNo=accoutNo;
		this.cust=cust;
		
	}
	
	public void display() {
		System.out.println(accountNo+" "+this.cust.custName);
	}
}
