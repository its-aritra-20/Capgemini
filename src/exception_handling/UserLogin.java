package exception_handling;

public class UserLogin {
	private int pin=1234;
	
	public void login(int pin) {
		if(this.pin==pin) {
			System.out.println("User successfully logged in!");
		}
		else {
			throw new InvalidPinException("The user pin is invalid");
		}
	}
	public static void main(String args[]) {
		System.out.println("Main starts");
		UserLogin user=new UserLogin();
		user.login(1223);
		System.out.println("Main ends");
	}
	
}
