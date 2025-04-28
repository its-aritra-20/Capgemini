package uber_case_study;

public class Driver extends User{
	private boolean available=true;
	Driver(String id, String name){
		super(id,name);
	}
	public boolean isAvailable() {
		return this.available;
	}
	
	public void setAvailable(boolean available) {
		this.available=available;
	}
	
	public void showProfile() {
		System.out.println("Driver id:"+this.id+" Driver name: "+this.name+" Driver availability status : "+this.available);
	}
	

}
