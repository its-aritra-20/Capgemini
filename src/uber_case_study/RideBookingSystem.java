package uber_case_study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RideBookingSystem {
	List<Customer> customers;
	List<Driver> drivers;
	List<Ride> rides;
	
	public void registerCustomer(Customer customer) {
		this.customers.add(customer);
	}
	
	public void registerDriver(Driver driver) {
		this.drivers.add(driver);
	}
	
	Ride bookRide(Customer customer) throws InvalidRideException{
		List<Driver>AvailableDrivers=drivers.stream().filter(driver->driver.isAvailable()).toList();
//		Iterator<Driver> itr=AvailableDrivers.iterator();
//		while(itr.hasNext()) {
//			if(itr.is)
//		}
		if(AvailableDrivers.isEmpty()) {
			throw new InvalidRideException("No Driver is available ");
		}
		else {
			System.out.println();
			rides.add(new Ride(customer,AvailableDrivers.getFirst(),"Booked"));
		}
		return new Ride(customer,AvailableDrivers.getFirst(),"Unavailable");
	}
	
	// C:\Users\User\Desktop\FileHandling\Uber
	public void saveRides() throws IOException{
		try (BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\FileHandling\\Uber\\rides.txt"))){
			for(Ride ride: rides) {
				writer.write(ride.rideDetails());
				writer.newLine();
			}
			
		}catch(IOException e) {
			System.out.println("Error saving rides: "+e.getMessage());
		}
	}
	void loadDriversFromFile() throws IOException{
	       try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Uber\\drivers.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                if (parts.length >= 2) {
	                    String id = parts[0].trim();
	                    String name = parts[1].trim();
	                    Driver driver = new Driver(id, name);
	                    registerDriver(driver);
	                }
	            }
	        }
	    }

	    public void saveDriversToFile() throws IOException {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Uber\\drivers.txt"))) {
	            for (Driver driver : drivers) {
	                writer.write(driver.id + "," + driver.name);
	                writer.newLine();
	            }
	        }
	    }

	    public void showAllDrivers() {
	        for (Driver driver : drivers) {
	            driver.showProfile();
	        }
	    }

	   
	    public List<Customer> getCustomers() {
	        return customers;
	    }

	    public void setCustomers(List<Customer> customers) {
	        this.customers = customers;
	    }

	    public List<Driver> getDrivers() {
	        return drivers;
	    }

	    public void setDrivers(List<Driver> drivers) {
	        this.drivers = drivers;
	    }

	    public List<Ride> getRides() {
	        return rides;
	    }

	    public void setRides(List<Ride> rides) {
	        this.rides = rides;
	    }

}
