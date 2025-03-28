package abstraction;

public abstract class Vehicle {
	static int a=10;
	int b=20;
	public abstract void start();
	public abstract void greet();
	void demo() {
		System.out.println("Welcome");
	}
	static void print() {
		System.out.println("Hello World");
	}
	//abstract int a=10; 

	// static method cannot be declared as abstract , abstract class can only be used using inheritence
	

}

