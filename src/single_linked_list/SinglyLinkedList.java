package single_linked_list;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count=0;
	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			count++;
		}
		else {
			tail.next=node;
			tail=tail.next;
			tail.next=null;
			count++;
		}
	}
	public void insertAtAny(int position , int data) {
		if(position==1) {
			Node node=new Node(data);
			node.next=head;
			head=node;
			count++;
			return;
		}
		if(position!=0 && position<=count) {
			Node node=new Node(data);
			Node curr=head;
			int i=1;
			if(head==null) {
				head=node;
				tail=node;
				count++;
				return;
			}
			else {
				while(i++<position-1) {
					curr=curr.next;
					
				}
				node.next=curr.next;
				curr.next=node;
				count++;
				return;	
			}
	}
		System.out.println("Not a valid postion");
	
	}

	
	
	public void delete() {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		System.out.println(head.data+" is deleted");
		Node curr=head;
		head=head.next;
		curr.next=null;
		count--;
		return;
	}
	
	public void deleteAtAny(int position) {
		
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		if(position!=0 && position<=count) {
			int i=1;
			Node curr=head;
			while(i++<position-1) {
				curr=curr.next;
			}
			System.out.println(curr.next.data+" is deleted");
			curr.next=curr.next.next;
			count--;
			return;
		}
		System.out.println("Invalid position");
	}
	
	public void update(int position, int data) {
		if(position!=0 && position<=count) {
			int i=1;
			Node curr=head;
			while(i++<position) {
				curr=curr.next;
			}
			curr.data=data;
			return;
		}
		System.out.println("Invalid position");
		
	}
	
	
	public void display() {
 		int i=0;
		Node current=head;
		if(head==null) {
			System.err.println("No data currently stored in the list");
			return;
		}
		while(i++<=count) {
			System.err.println(current.data);
			current=current.next;
		}
		System.out.println();
	}
}
