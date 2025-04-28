package uber_case_study;

public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;
	
	Ride(Customer customer,Driver driver,String status){
		setCustomer(customer);
		setDriver(driver);
		this.status=status;
		this.driver.setAvailable(false);
		
	}
	
	public void completeRide() {
		this.status="Completed";
		this.driver.setAvailable(true);
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public String rideDetails() {
		return "Customer name: "+this.customer.name+" Driver name : "+this.driver.name+" Current status : "+this.getStatus();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	
	
	
	
}
