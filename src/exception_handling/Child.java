package exception_handling;

public class Child extends Parent{
	void demo() throws ArithmeticException{
		//In this example where we are overriding the error which is being thrown 
		//as it does not match the exception that has been thrown by by the parent
		//class , it must be the same, or we can simply override it without any 
		//exceptions , it will be overridden normally without any exception.
		
		
		
		//if the parent class method is throwing an exception then the
		//child class method does not need to throw the exception
		
		System.out.println("Child class");
	}
	public static void main(String args[]) {
		Parent p=new Child();
		p.demo();
	}
	
}
