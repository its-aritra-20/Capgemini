package food_delivery;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private String restaurantName;
	private int pincode;
	List<Item> items;
	Restaurant(String name,int pincode){
		setRestaurantName(name);
		setPincode(pincode);
		items=new ArrayList<Item>();
	}
	
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
