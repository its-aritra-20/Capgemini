package engine_practice;

public abstract class Engine {
	String engineType;
	int engineCapacity;
	static double speed=0;;
	Engine(String engineType, int engineCapacity){
		this.engineType=engineType;
		this.engineCapacity=engineCapacity;
	}
	
	
	abstract void brake(int decrement);
	abstract void accelerate(int increment);
}
