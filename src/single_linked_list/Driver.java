package single_linked_list;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SinglyLinkedList list=new SinglyLinkedList();
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 to enter data at front\nEnter 2 to display the data\nEnter 3 to update the data for a specific position\nEnter 4 to insert at a specific postion\nEnter 5 to delete from front\nEnter 6 to delete at a specific postion\nEnter 7 to exit");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the data:");
				int data=sc.nextInt();
				list.insert(data);
				break;
			}
			case 2:{
				list.display();
				break;
			}
			case 3:{
				System.out.println("Enter the position to be updated:");
				int postion=sc.nextInt();
				System.out.println("Enter the data:");
				int data=sc.nextInt();
				list.update(postion, data);
				break;
				
			}
			case 4:{
				System.out.println("Enter the position to be updated:");
				int postion=sc.nextInt();
				System.out.println("Enter the data:");
				int data=sc.nextInt();
				list.insertAtAny(postion, data);
				break;
			}
			case 5:{
				list.delete();
				break;
			}
			case 6:{
				System.out.println("Enter the position to be updated:");
				int position=sc.nextInt();
				list.deleteAtAny(position);
				break;
			}
			case 7:{
				flag=false;
				break;
			}
			
			
			default :
				System.out.println("Invalid choice!");
			}
		}	
	}
}
