package stack;

import java.util.Scanner;

public class StackLinkedDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinkedList st = new StackLinkedList();
        int flag = 1;

        while (flag != 0) {
            System.out.println("\n1: Push\n2: Pop\n3: Peek\n4: Display\n0: Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data: ");
                    st.push(sc.nextInt());
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.display();
                    break;
                case 0:
                    flag = 0;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
