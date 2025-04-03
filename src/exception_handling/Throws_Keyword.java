package exception_handling;

public class Throws_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div(10, 2);

	}

	public static void div(int x,int y) throws RuntimeException , ClassNotFoundException,Exception{
		System.out.println(x/y);
		Class.forName("demo");
	}
}
