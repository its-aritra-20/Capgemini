package relational_operators;

import java.util.Scanner;

public class PositiveNegativeOddEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number >= 0 && number % 2 == 0) {
			System.out.println("Positive Even");
		} else if (number >= 0 && number % 2 != 0) {
			System.out.println("Positive Odd");
		} else if (number < 0 && number % 2 == 0) {
			System.out.println("Negative Even");
		} else {
			System.out.println("Negative Odd");
		}

	}

}
