package JavaActivity2_2;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	
		private List<String> passengers;
	  	private int maxPassengers;
	  	private Date lastTimeTookOf;
	  	private Date lastTimeLanded;
	
	    public Plane(int maxPass) 
	    {
		maxPassengers=maxPass;
		passengers=new ArrayList<>();
		
	    }
	    
	    public void onboard(String passengerName)
	    {
	    	passengers.add(passengerName);
	    }
	    
	    public Date takeoff()
	    {
	    	Date date = new Date(); 
	    	return date;
	    	
	    	
	    }
	    
	    public void land()
	    {
	    	lastTimeLanded=new Date();
	    	passengers.clear();
	    }
	
	    public Date getLastTimeLanded()
	    {
	    	return lastTimeLanded;
	    }
	
	    public List<String> getPassengers()
	    {
	    	return passengers;
	    }
	
	

}
