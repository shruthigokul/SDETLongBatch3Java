package JavaActivity2_4;

public class Classmain {

	public static void main(String[] args) {
		try {
			Classmain.exceptionTest("String1");
			Classmain.exceptionTest(null);
			Classmain.exceptionTest("String3");
		} catch (CustomException e) {
			System.out.println("Inside catch block:"+e.getMessage());
		}
		

	}
	
	public static void exceptionTest(String str) throws CustomException
	{
		if(str==null)
		{
			throw new CustomException("String value is null");
		}
		else {
		System.out.println("The string is :"+str);
		}
	}

}
