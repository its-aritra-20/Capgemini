package one_to_many;

public class Bank {
	String bankNo;
	static int count=0;
	Customer[] customers;

	public Bank(int size, String bankNo) {
		this.customers = new Customer[size];
		this.bankNo = bankNo;
	}

	public void addCustomer(Customer customer) {
		if (count < customers.length) {
			customers[count++] = customer;
			System.out.println("Customer added");
		} else {
			System.out.println("Customer not added");
		}
	}

	public void displayCustomers() {
		for (int i = 0; i < count; i++) {
			System.out.println(customers[i].custName);
		}
	}

}
