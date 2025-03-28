package case_study;

public abstract class Payment {
	private double amount;
	private String transactionId;
	public abstract void processPayment();
	
	public Payment(double amount, String transactionId) {
		this.amount=amount;
		this.transactionId=transactionId;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public String getTransactionId() {
		return this.transactionId;
	}
	
	public double applyDiscount() {
		return amount>500?amount*0.1:0;
	}
	
}
