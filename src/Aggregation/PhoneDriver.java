package Aggregation;

public class PhoneDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim sim=new Sim("1234567899");
		Phone P=new Phone("apple",sim);
		P.display();
		P=null;
		System.out.println(sim.phoneNo);

	}

}
         