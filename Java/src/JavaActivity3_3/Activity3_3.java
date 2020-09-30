package JavaActivity3_3;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3 {

	public static void main(String[] args) {
		//create a queue
		Queue<Integer> q=new LinkedList<Integer>();
		
		//add first 5 natural numbers to it
		 for (int i=0;i<5;i++) {
	            q.add(i);
	        }
		
		
		//Remove a number in the Queue using the remove() method.
		q.remove(1);
		
		//Peek() at the first number in the Queue after removal.
		System.out.println(q.peek());
		
		//Print the size of the Queue using the size() method.
		System.out.println("The size of the queue is: "+q.size());
		
		
		//Print the updated Queue.
		System.out.println(q);
		
	
	}

}
