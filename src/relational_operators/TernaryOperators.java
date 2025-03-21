package relational_operators;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var string = 10 > 20 ? "10 is greater" : 20;
		int a = 10;
		int b = 20;
		int c = 5;
		int ans = 10 > 20 ? 10 : 20;
		System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
	}
}
