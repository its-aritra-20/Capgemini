package engine_practice;

public class Car extends Engine{
	int seats;
	double mileage;
	Car(String engineType, int engineCapacity, int seats, double mileage){
		
		super(engineType,engineCapacity);
		this.seats=seats;
		this.mileage=mileage;
	}
	void brake(int decrement) {
		if(super.speed>=decrement) {
			super.speed-=decrement;
			return;
		}
		super.speed=0;	
	}
	void accelerate(int increment) {
		super.speed+=increment;
	}
	@Override
	public String toString() {
		return "Car [seats=" + seats + ", mileage=" + mileage + ", engineType=" + engineType + ", engineCapacity="
				+ engineCapacity + "]";
	}
	
	
}
