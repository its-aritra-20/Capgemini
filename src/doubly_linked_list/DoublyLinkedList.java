package doubly_linked_list;



public class DoublyLinkedList {
    Node head = null;
    Node tail = null;
    static int count = 0;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
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
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
        } else if (position == count + 1) {
            tail.next = node;
            node.prev = tail;
            tail = node;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            node.prev = current;
            current.next.prev = node;
            current.next = node;
        }

        count++;
    }

    public void delete() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println(head.data + " is deleted");

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
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
        for (int i = 1; i < position; i++) {
            current = current.next;
        }

        System.out.println(current.data + " is deleted");

        if (current == tail) {
            tail = current.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

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

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.println("Forward Traversal:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail;
        System.out.println("Backward Traversal:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
