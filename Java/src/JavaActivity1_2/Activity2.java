package JavaActivity1_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.SetOverrideType;

public class Activity2 {

	public static void main(String[] args) {
		int[] intarr=new int[] {10,77,10,54,-11,10,10};
		
		int sum=0;
		for(int i=0;i<intarr.length;i++)
		{
			if(intarr[i]==10)
			{
				sum=sum+intarr[i];
				if(sum==30)
				{
					break;
				}
			}
			
		}
		if(sum==30)
		{
			
			System.out.println("the sum of 10's is 30");
		}
		else 
		{		
			System.out.println("no!!!its not 30");		
			
		}
	
				

	}

}
