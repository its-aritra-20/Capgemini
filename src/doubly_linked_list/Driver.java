package doubly_linked_list;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        boolean flag = true;

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at end");
            System.out.println("2. Display forward");
            System.out.println("3. Display backward");
            System.out.println("4. Update data at position");
            System.out.println("5. Insert at specific position");
            System.out.println("6. Delete from front");
            System.out.println("7. Delete at specific position");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    list.insert(sc.nextInt());
                    break;
                case 2:
                    list.displayForward();
                    break;
                case 3:
                    list.displayBackward();
                    break;
                case 4:
                    System.out.print("Enter position to update: ");
                    int upos = sc.nextInt();
                    System.out.print("Enter new data: ");
                    int newData = sc.nextInt();
                    list.update(upos, newData);
                    break;
                case 5:
                    System.out.print("Enter position to insert at: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    list.insertAtAny(pos, data);
                    break;
                case 6:
                    list.delete();
                    break;
                case 7:
                    System.out.print("Enter position to delete: ");
                    int dpos = sc.nextInt();
                    list.deleteAtAny(dpos);
                    break;
                case 8:
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

