package JavaActivity3_1;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.List;

public class Activity3_1 {

	
	public static void main(String[] args) {
		
		//created array list
		List<String> arr=new ArrayList<String>();
		
		//addnames to list
		arr.add("NameOne");
		arr.add("NameTwo");
		arr.add("NameThree");
		arr.add("NameFour");
		arr.add("NameFive");
		
		//print all names using for loop
		for(String l:arr)
		{
			System.out.println(l);
		}
		
		//Then use get() method to retrieve the 3rd name in the ArrayList.
		System.out.println("The 3rd member in the list is: "+arr.get(2));
		
		//Use contains() method to check if a name exists in the ArrayList.
		System.out.println("Check if the name 'NameOne' exists in the list: "+arr.contains("NameOne"));
		
		//Use size() method to print the number of names in the ArrayList.
		System.out.println("The size of the arraylist is: "+arr.size());
		
		//Use remove() method to remove a name from the list and print the size() of the list again.
		arr.remove("NameTwo");
		System.out.println("The size of the arraylist is: "+arr.size());
	}

}
