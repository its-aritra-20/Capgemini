package bank_management_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	private String bankName;
	private List<Customer> customers;
	
	public Bank(String bankName) {
		this.bankName=bankName;
		customers=new ArrayList<Customer>();
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void removeCustomer(Customer customer) {
		Iterator<Customer> itr=customers.iterator();
		while(itr.hasNext()) {
			if(itr.equals(customer)){
				itr.remove();
				System.out.println("Bank Name : "+this.bankName+" Account Name : "+customer.getName()+" removed");
				return;
			}
			itr.next();
			
		}
		System.out.println("Account not found ! ");
		
	}
	
	public void displayAll() {
		Iterator<Customer> itr=customers.iterator();
		System.out.println("Bank Name : "+this.bankName);
		System.out.println("-------Account Holder's Details --------");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//itr.next();
		}
	}
}
