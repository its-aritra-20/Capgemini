package StaticAndNonStatic;

public class Demo1 {
	static int id=10;
	String name="raj";
	public Demo1() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1()
;		System.out.println(id);
		System.out.println(d.name);

	}

}
