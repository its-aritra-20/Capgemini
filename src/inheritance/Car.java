package inheritance;

public class Car extends Vehicle {
	int price;
	public Car(String name,String engineType,int price) {
		this.name=name;
		this.price=price;
		this.engineType=engineType;
	}
}
