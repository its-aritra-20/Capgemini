package stack;

public class StackLinkedList {

    private StackNode top; // Stack top
    private int count;

    public StackLinkedList() {
        top = null;
        count = 0;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        node.next = top;
        top = node;
        count++;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
        count--;
    }

    public void peek() {
        if (top == null) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("Empty stack");
            return;
        }
        StackNode curr = top;
        System.out.println("Stack elements (top to bottom):");
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public int size() {
        return count;
    }
}
