package higher_order_function;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.greet(()-> System.out.println("Hello"));
	}

}
