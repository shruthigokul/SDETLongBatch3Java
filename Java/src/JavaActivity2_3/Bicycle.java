package JavaActivity2_3;

public class Bicycle implements BicycleParts,BicycleOperations{

	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed) {
		this.gears=gears;
		this.currentSpeed=currentSpeed;
		
	}
	
	public int applyBrake(int decrement)
	{
		currentSpeed=currentSpeed-decrement;
		System.out.println("The current speed after applying brake is:"+currentSpeed);
		return currentSpeed;
		
	}
	
	public int speedUp(int increment)
	{
		currentSpeed=currentSpeed+increment;
		System.out.println("The current speed after accelerating is:"+currentSpeed);
		return currentSpeed;
	}
	
	public String bicyelDesc()
	{
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}


}
