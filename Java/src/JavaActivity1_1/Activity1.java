package JavaActivity1_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity1 {
	
	public static void main(String[] args) {
		Car c=new Car();
		c.make=2014;
		c.transmission="Manual";
		c.col="Black";
		c.displayCharecteristics();
		c.accelerate();
		c.brake();

		
		Date date = new Date(); 
    	//SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    	System.out.println(date);
	}


}
