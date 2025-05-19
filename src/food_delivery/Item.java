package food_delivery;

public class Item {
	private String itemName;
	private int price;
	Item(String itemName,int price){
		setName(itemName);
		setPrice(price);
				
	}
	
	
	public void setName(String name) {
		this.itemName=name;;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String getName() {
		return this.itemName;
		
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
	
	
}
