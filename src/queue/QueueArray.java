package queue;

public class QueueArray {
    private int front, rear, size;
    private int[] queue;

    public QueueArray(int capacity) {
        front = 0;
        rear = -1;
        size = 0;
        queue = new int[capacity];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
        System.out.println(data + " enqueued.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        System.out.println(queue[front] + " dequeued.");
        front = (front + 1) % queue.length;
        size--;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue elements:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    private boolean isFull() {
        return size == queue.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}

