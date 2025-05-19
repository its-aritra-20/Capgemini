package queue;

public class QueueLinkedList {
    private QueueNode front;
    private QueueNode rear;
    private int size;

    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(int data) {
        QueueNode node = new QueueNode(data);
        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println(data + " enqueued.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        System.out.println(front.data + " dequeued.");
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue elements:");
        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }
}
