package methodReferences;

public class MethodReferencesDriver {
	public static void main(String[] args) {
		Demo1 d=System.out::println;
		d.print("Hello World");
		System.out.println("--------------------------------------------------------")

		//referring a non static method to target functional interface
		MethodReferencesDriver driver=new MethodReferencesDriver();
		Test t = driver::print; 
		t.greet(5,"Welcome");
		System.out.println("--------------------------------------------------------")
	
	}

}
