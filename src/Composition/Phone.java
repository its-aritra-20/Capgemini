package Composition;

public class Phone {
	String phoneName;
	Battery B;
	public Phone(String phoneName, String batteryType) {
		this.phoneName=phoneName;
		this.B=new Battery(batteryType);
	}
	public void display() {
		System.out.println(this.phoneName+"  "+B.batteryType);
	}
}
