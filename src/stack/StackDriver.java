package stack;

import java.util.Scanner;

public class StackDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		Stack st=new Stack(arr);
		int flag=1;
		while(flag!=0){
			System.out.println("Enter 1 to push\nEnter 2 to pop\nEnter 3 to peek\nEnter 4 to display\nEnter 0 to exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the data");
				st.push(sc.nextInt());
				break;
			}
			case 2:{
				st.pop();
				break;
			}
			case 3:{
				st.peek();
				break;
			}
			case 4:{
				st.display();
			}
			case 0:{
				flag=0;
				break;
			}
			default:
				System.out.println("Invalid choice");
				
				
			}
		}
		

	}

}
