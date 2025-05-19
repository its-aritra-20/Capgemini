package queue_collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p=new PriorityQueue();
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(4);
		p.add(6);
		p.add(5);
		p.poll();
		System.out.println(p);
	}

}
