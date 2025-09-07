package Selenium;

public class VerificationUtil {

	
	 public static boolean verify(String actualValue ,String  expectedValue) {
			if(actualValue.equals(expectedValue)) {
			System.out.println("actual value "+ actualValue +" is equal to "+ expectedValue);
				return true;
			}
			
			else {
				System.out.println("actual value "+ actualValue +" is equal to "+ expectedValue);
				return false;
			}
	 }
			
	public static boolean verifyContains(String actualValue,String fractionValue) {
		if(actualValue.contains(fractionValue)) {
			System.out.println("fraction value : " + fractionValue + "is present in" + actualValue);
			return true;
		}
		
		else {
			System.out.println("fraction value : " + fractionValue + "is not present in" + actualValue);
			return false;
		}
	
	 }

	 
}
