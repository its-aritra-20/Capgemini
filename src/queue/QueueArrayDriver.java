package queue;


import java.util.Scanner;

public class QueueArrayDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of the queue: ");
        int capacity = sc.nextInt();

        QueueArray q = new QueueArray(capacity);

        int choice;
        do {
            System.out.println("\n1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Peek");
            System.out.println("4: Display");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
