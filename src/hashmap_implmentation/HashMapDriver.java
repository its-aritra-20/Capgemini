package hashmap_implmentation;



import java.util.Scanner;

public class HashMapDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap map = new HashMap();

        int choice;
        do {
            System.out.println("\n1: Put");
            System.out.println("2: Get");
            System.out.println("3: Remove");
            System.out.println("4: Display");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    Object key = sc.nextLine();
              //      sc.nextLine();
                    System.out.print("Enter value: ");
                    Object value = sc.nextLine();
                    map.put(key, value);
                    break;
                case 2:
                    System.out.print("Enter key to get value: ");
                    key = sc.nextLine();
                    Object result = map.get(key);
                    if (result.equals(-1)) {
                        System.out.println("Key not found.");
                    } else {
                        System.out.println("Value: " + result);
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextLine();
                    map.remove(key);
                    break;
                case 4:
                    map.display();
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
