import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.omg.CORBA.SetOverrideType;

public class excep {

	public static void main(String[] args) {
			
		LinkedList<String> newliLinkedList=new LinkedList<String>();
		
		newliLinkedList.add("String1");
		newliLinkedList.add("String2");
		newliLinkedList.add("String3");
		newliLinkedList.add("String4");
		newliLinkedList.add("String4");
		
		newliLinkedList.add(1,"String1.1");
		
		System.out.println(newliLinkedList.get(1));
		System.out.println(newliLinkedList.remove("String2"));
		System.out.println(newliLinkedList);
		
		
		List<String> oliLinkedList=new ArrayList<String>();
		
		oliLinkedList.add("String4");
		oliLinkedList.add("String5");
		oliLinkedList.add("String6");
		oliLinkedList.add("String7");
		oliLinkedList.add("String7");
		
		System.out.println(oliLinkedList);
		oliLinkedList.add(1,"String4.1");
		
		Set<String> oo=new HashSet<String>();
		oo.add("abc");
		oo.add("abc");
		
		System.out.println(oo);
		
		
		
		
		

		
	}

}
