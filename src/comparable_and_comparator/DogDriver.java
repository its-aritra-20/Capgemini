package comparable_and_comparator;

import java.util.Arrays;

public class DogDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog arr[]=new Dog[3];
		arr[0]=new Dog("Kanchan",22,"LTiMindtree/Capgemini");
		arr[1]=new Dog("Kancha",22,"LTiMindtree/Capgemini");
		arr[2]=new Dog("Turjo",41,"Capgemini");
		
		
		Arrays.sort(arr);
		for(Dog a:arr) {
			System.out.println(a);
		}
		
		CompareByBreed b1=new CompareByBreed();
		Arrays.sort(arr,b1);
		for(Dog a:arr) {
			System.out.println(a);
		}
		
	}

}
