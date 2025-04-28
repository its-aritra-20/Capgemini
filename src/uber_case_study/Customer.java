package uber_case_study;

public class Customer extends User{
	Customer(String id, String name){
		super(id,name);
	}
	
	
	public void showProfile() {
		System.out.println("Customer id:"+this.id+" Customer name: "+this.name);
	}
}
