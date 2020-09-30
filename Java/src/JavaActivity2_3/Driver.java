package JavaActivity2_3;

import javax.management.MBeanAttributeInfo;

public class Driver {

	public static void main(String[] args) {
		MountainBike mountainBike=new MountainBike(3, 100, 3);
		System.out.println(mountainBike.bicyelDesc());
		mountainBike.speedUp(20);
		mountainBike.applyBrake(5);
	}

}
