package case_study;


public class Paypal extends Payment{
	
	public Paypal(double amount, String transactionId) {
		super(amount,transactionId);
	}
	
	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing Paypal payment!");
		double originalAmount=getAmount();
		System.out.println("Amount: $"+originalAmount);
		String originalTransactionId=getTransactionId();
		System.out.println("Transaction Id: "+originalTransactionId);
		double discount=applyDiscount();
		System.out.println("Discount: $"+discount);
		double transactionFee=originalAmount*0.03;
		System.out.println("Transaction fees: $"+transactionFee);
		double finalAmount=originalAmount-discount+transactionFee;
		System.out.println("Final payable amount: $"+finalAmount);
		System.out.println("Paypal payment successful!");
		
		
	}

}
