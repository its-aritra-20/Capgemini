package exception_handling;

public class Throw_Keyword {
	public static void div(int a,int b) {
		if(b!=0) {
			System.out.println(a/b);
		}
		else {
			throw new ArithmeticException("Denominator is zero");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			div(10,0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}
	//throw keyword is used to explicitly throw an exception by yourself
	//when we dont want our JVM to throw Exception

}
