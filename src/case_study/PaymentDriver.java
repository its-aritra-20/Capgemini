package case_study;

public class PaymentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1=new CreditCard(600,"TXN12345");
		p1.processPayment();
		
		Payment p2=new Paypal(300, "TXN678990");
		p2.processPayment();

	}

}
