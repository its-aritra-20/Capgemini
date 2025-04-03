package Encapsulation;



	public class NetBankDriver {

		  public static void main(String[] args) throws Exception {

			Netbank b=new Netbank();

			b.getBalance(1234);

			b.setBalance(5000,1234);

			b.getBalance(1234);

			b.withdraw(500,1234);

			b.getBalance(1234);

			b.withdraw(10000,1234);

			b.getBalance(1234);

		}

		}

