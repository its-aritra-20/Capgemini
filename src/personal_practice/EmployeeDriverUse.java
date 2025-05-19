package personal_practice;

public class EmployeeDriverUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee f=new FullTimeEmployee("Honu", 30000, 10000);
		PartTimeEmployee p=new PartTimeEmployee("Hola", 343, 9);
		f.fullTimeEmployeeInfo();
		System.out.println();
		p.partTimeEmployeeInfo();
		System.out.println();
		if(p.compareTo(f)>0) {
			System.out.println("Arita is gorib");
		}else {
			System.out.println("Aritra is more gorib");
		}
		

	}

}
