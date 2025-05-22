package bank_management_system;

public class Bank_Driver {
	public static void main(String[] args) {
		
		Customer aritra=new Customer("Aritra", "C1005", 2975.00, "@Sarbani28");
		Customer honu=new Customer("Honu", "C1006", 3975.00, "@Sarbani28");
		Bank canara=new Bank("Canara Bank");
		canara.addCustomer(aritra);
		aritra.addBank(canara);
		//canara.removeCustomer(aritra);
		Atm barasatAtm=new Atm("Barasat",50000);
		barasatAtm.processTransaction(aritra);
		canara.displayAll();
		
		
	}
}
