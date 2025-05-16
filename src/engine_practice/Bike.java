package engine_practice;

public class Bike extends Engine{
	int seats;
	double mileage;
	Bike(String engineType, int engineCapacity, int seats, double mileage){
		super(engineType,engineCapacity);
		this.seats=seats;
		this.mileage=mileage;
	}
	void brake(int decrement) {
		if(super.speed>=decrement) {
			super.speed-=decrement;
			return;
		}
		speed=0;	
	}
	void accelerate(int increment) {
		super.speed+=increment;
	}
}
