package JavaActivity3_2;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		//Create a hashset names hs
		HashSet<String> hs=new HashSet<>();
		
		//Add 6 objects using add() method to the HashSet.
		hs.add("hashOne");
		hs.add("hashTwo");
		hs.add("hashThree");
		hs.add("hashFour");
		hs.add("hashFive");
		hs.add("hashSix");
		
		//Then print the size of the HashSet using the size() method.
		System.out.println("The size of hashset is: "+hs.size());
		
		//Remove an element using the remove() method.
		hs.remove("hashThree");
		
		//Remove an element not present in set
		hs.remove("none");
			
		//Use the contains() method to check if an item is in the Set or not.
		System.out.println("Is the element 'hashTwo' present in Hashset: "+hs.contains("hashTwo"));
		
		System.out.println("The updated hashset is: "+hs);
		
		//Print the updated set.
	}

}
