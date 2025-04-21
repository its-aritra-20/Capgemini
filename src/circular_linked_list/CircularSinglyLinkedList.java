package circular_linked_list;

public class CircularSinglyLinkedList {
    Node head = null;
    Node tail = null;
    static int count = 0;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        count++;
    }

    public void insertAtAny(int position, int data) {
        if (position <= 0 || position > count + 1) {
            System.out.println("Invalid position");
            return;
        }

        Node node = new Node(data);
        if (position == 1) {
            if (head == null) {
                head = tail = node;
                node.next = head;
            } else {
                node.next = head;
                head = node;
                tail.next = head;
            }
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
            if (position == count + 1) {
                tail = node;
                tail.next = head;
            }
        }
        count++;
    }

    public void delete() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        System.out.println(head.data + " is deleted");

        if (head == tail) { // only one element
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        count--;
    }

    public void deleteAtAny(int position) {
        if (position <= 0 || position > count) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            delete();
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        System.out.println(current.next.data + " is deleted");

        if (current.next == tail) {
            tail = current;
        }

        current.next = current.next.next;
        tail.next = head;

        count--;
    }

    public void update(int position, int data) {
        if (position <= 0 || position > count) {
            System.out.println("Invalid position");
            return;
        }

        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.data = data;
        System.out.println("Data updated at position " + position);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        int i = 0;

        do {
            System.out.println("Node " + (++i) + ": " + current.data);
            current = current.next;
        } while (current != head);
    }
}
