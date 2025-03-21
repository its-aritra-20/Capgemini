package StaticAndNonStatic;

public class Demo2 {
	public Demo2() {
		System.out.println(Demo1.id);
		//System.out.println(Demo1.name);  Error
		Demo1 d=new Demo1();
		System.out.println(d.name); 
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Demo2 d1=new Demo2();

	}

}
