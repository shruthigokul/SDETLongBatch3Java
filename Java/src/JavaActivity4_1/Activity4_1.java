package JavaActivity4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
	
		//Creating a scanner object
		Scanner scan= new Scanner(System.in);
	
		//Creating a Arraylist object
		List<Integer> list=new ArrayList<Integer>();
		
		//Creating a random object
		Random indexGen=new Random();
	
		
		System.out.println("Enter the values for integer and enter 'EOF' for end of input");
		//accept the interger values into an arraylist
		try {
			while(scan.hasNext())
			{
			list.add(scan.nextInt());
			}
		} catch (Exception e) {
			System.out.println("End of scanning");
		}
		
			
		//converting arraylist into an array
		
		Integer num[]=list.toArray(new Integer[1]);
		
		int getIndexvalue=indexGen.nextInt(num.length);
		System.out.println("The value at the index ["+getIndexvalue+"] is: "+num[getIndexvalue]);
		
		
		
		
		
	
	
	}

}
