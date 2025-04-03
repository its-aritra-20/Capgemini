package exception_handling;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		alpha();
	}
	public static void alpha() {
		System.out.println("This is alpha");
		beta();
	}
	public static void beta() {
		System.out.println("This is beta");
		gamma();
	}
	public static void gamma() {
		System.out.println("This is gamma");
		try {
		System.out.println(10/0);
		}catch(ArithmeticException a ) {
			System.out.println("Arithmetic Exception handled");
		}
	}

}                                
