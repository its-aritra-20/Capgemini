package circular_linked_list;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        boolean flag = true;

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at end");
            System.out.println("2. Display");
            System.out.println("3. Update data at position");
            System.out.println("4. Insert at specific position");
            System.out.println("5. Delete from front");
            System.out.println("6. Delete at specific position");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    list.insert(sc.nextInt());
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    int upos = sc.nextInt();
                    System.out.print("Enter new data: ");
                    int newData = sc.nextInt();
                    list.update(upos, newData);
                    break;
                case 4:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    list.insertAtAny(pos, data);
                    break;
                case 5:
                    list.delete();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    int dpos = sc.nextInt();
                    list.deleteAtAny(dpos);
                    break;
                case 7:
                    flag = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
