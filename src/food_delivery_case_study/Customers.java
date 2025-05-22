package food_delivery_case_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customers {
	public static Scanner sc=new Scanner(System.in); 
	private String name;
	private int id;
	private String password;
	
	List<Restaurant> restauras;
	Customers(String name,int id,String password){
		this.name=name;
		this.id=id;
		this.password=password;
		//this.items=new ArrayList<Item>();
		this.restauras=new ArrayList<Restaurant>();
		
	}
	
	
	public void addRestaurants(Restaurant restaurant,int password) {
		
			if(this.password.equals(restaurant)) {
				int c=0;
				restaurant.items.add(new Item(sc.nextLine(),sc.nextInt()));
				
			}
			else {
				System.out.println("Wrong password!");
			}
		
	
	}
	
}
