package JavaActivity1_1;

public class Car {

	String col;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car()
	{
		doors=4;
		tyres=4;
		
	}
	
	public void displayCharecteristics()
	{
		System.out.println("The value for variable col is:"+col);
		System.out.println("The value for variable transmission is:"+transmission);
		System.out.println("The value for variable make is:"+make);
		System.out.println("The value for variable tyres is:"+tyres);
		System.out.println("The value for variable doors is:"+doors);
	}
	
	public void accelerate()
	{
		System.out.println("The car is moving forward");
	}
	
	public void brake()
	{
		System.out.println("The car has stopped");
	}
	
	


}
