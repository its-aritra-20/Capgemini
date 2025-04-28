package uber_case_study;

import java.util.Iterator;
import java.util.List;

@SecurityCheck(role="Admin")
public class Admin extends User{
	protected String id;
	protected String name;
	Admin(String id,String name){
		super(id,name);
	}
	
	Class<SecurityCheck> c= SecurityCheck.class;
	SecurityCheck s=c.getDeclaredAnnotation(SecurityCheck.class);
	
	void showProfile() {
		System.out.println("Admin name :"+this.name+" Admin's Role : "+s.role());
	}
	
	public void removeDriver(List<Driver> drivers, String driverId){
		try {
			if(!s.role().equals("Admin")) {
				throw new SecurityException("Access Denied : Role not admin");
			}
			else {
				boolean removedDriver=false;
				Iterator<Driver> itr=drivers.iterator();
				while(itr.hasNext()) {
					Driver drive=itr.next();
					if (drive.id.equals(driverId)) {
						itr.remove();
						removedDriver=true;
						System.out.println("Driver Id: "+drive.id+" Driver Name : "+drive.name+" is removed");
						return;
					}
				}
				System.out.println("Driver Id not found !");
			}
			
		}catch(Exception e) {
			System.out.println("Security Error"+ e.getMessage());
		}
	}
}
