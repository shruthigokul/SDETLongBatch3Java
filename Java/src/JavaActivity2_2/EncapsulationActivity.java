package JavaActivity2_2;

import javax.swing.LookAndFeel;

public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
		//Initialising the plane with max passenger as 10
		Plane plane=new Plane(10);
		
		//onboarding pasengers to the plane
		plane.onboard("PassengerOne");
		plane.onboard("PassengerTwo");
		
		//Plane takes off
		System.out.println("Plane take off time:"+plane.takeoff());
		
		//List of passengers in the plane
		for(String iPassenger: plane.getPassengers())
		{
			System.out.println(iPassenger);
		}
		
		//flying..
		Thread.sleep(5000);
		
		//Plane lands
		plane.land();
		
		//printing the plane landing time
		System.out.println(plane.getLastTimeLanded());
		
		

	}

}
