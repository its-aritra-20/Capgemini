package one_to_many;

import java.util.Scanner;

public class PostDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Users:");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter User name:");
		String userName = sc.nextLine();
		User use = new User(3, userName);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to add ");
			System.out.println("Enter 2 to display ");
			System.out.println("Enter 3 to exit ");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter postId");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter postDescription");
				String postDescription = sc.next();
				Post post = new Post(postDescription, id);
				// System.out.println("Enter Name");
				// String name=sc.next();
				use.addUser(post);
				break;
			case 2:
				use.displayUsers();
				break;
			case 3:
				flag = false;
				break;
			}

		}
	}

}
