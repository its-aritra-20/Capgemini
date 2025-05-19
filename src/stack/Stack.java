package stack;

public class Stack {
	static int top=-1;
	int[]arr;
	Stack(int[] arr){
		this.arr=arr;	}
	
	void push(int data) {
		if(top!=arr.length) {
			arr[++top]=data;
			System.out.println(data+" is pushed into the stack");
			return;
		}
		System.out.println("Stack Overflow");
	}
	void pop() {
		if(top!=-1) {
			System.out.println(arr[top]+" is popped out from the stack");
			top--;
			return;
		}
		System.out.println("Stack Underflow");
	}
	
	void peek() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		if(top==arr.length) {
			System.out.println("Stack Overflow");
			return;
		}
		System.out.println(arr[top]);
		}
	void display() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]+"	");
		}
	}
}
