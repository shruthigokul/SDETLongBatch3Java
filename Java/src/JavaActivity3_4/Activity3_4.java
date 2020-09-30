package JavaActivity3_4;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_4 {

	public static void main(String[] args) {
		Deque<String> de=new LinkedList<String>();
		
		//adding animals
		de.add("Tiger");
		de.addFirst("Lion");
		de.addLast("Wolf");
		de.offer("Hyena");
		de.offerFirst("Puma");
		de.offerLast("Panther");
		
		//Iterating through iterator
		Iterator<String> iterator=de.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//Peek() at the head element and the tail element of the queue.
		System.out.println(de.peek());
		
		//Check if there is a Wolf present in the queue using the contains() method.
		System.out.println("check if wolf is present: "+de.contains("Wolf"));

		//Remove() the first and last element from the queue.
		de.removeFirst();
		de.removeLast();
		
		//Print the size() of the queue after removal.
		System.out.println("The size of the queue is: "+de.size());
		
		

	}

}
