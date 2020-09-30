package JavaActivity2_3;

public class MountainBike extends Bicycle{

	int seatHeight;
	
	public MountainBike(int gears, int currentSpeed,int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight=seatHeight;
	}

	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicyelDesc()
	{
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed+ "\nSeat height of the bicycle is"+seatHeight);
	}

	

}
