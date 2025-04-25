package exception_handling_case_study;

class AtmDriver{
	public static void main(String[] args) {
		AtmDemo a=new AtmDemo(5000,1234);
		try {
			a.checkPin(123);
			
		}catch(InsufficientBalanceException e) {
			System.out.println("Exception :"+e.getMessage());
		}catch(PinWrongException p) {
			System.out.println("Exception : "+p.getMessage());
		}
		finally {
			System.out.println("Transaction ended");
		}
	}
}