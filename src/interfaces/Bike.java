package interfaces;

public class Bike implements Vehicle {

	public void test() {
		System.out.println("Child class");
	}

	public void print() {
		System.out.println("Hello from bike");
	}

	public void start() {
		System.out.println("Bike engine starts");
	}

}
