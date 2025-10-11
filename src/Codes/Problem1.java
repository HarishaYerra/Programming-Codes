/*You are asked to create an application for registering the details of jobseeker. 
The requirement is: 
Username should always end with _job and 
there should be atleast minimum of 8 characters to the left of _job.
 Write a function to validate the same. Return true in case the validation is passed.
 In case of validation failure return false.*/


package Codes;

import java.util.*;
public class Problem1 {
	public static void main(String args[]) {
		System.out.print("Enter the UserName: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Problem1 p1= new Problem1();
		boolean res= p1.ValidateString(s);
		//call Validate string to check validation
		if (res)
			System.out.println("Valid Username");
		else
			System.out.println("Invalid Username");
	}
	
	public boolean ValidateString(String s) {
		String demoString="_job";
		if(s.length()!=12) 
			return false;
		
		else if(s.length()==12  &&  demoString.equals(s.substring(8,12)))
			return true;

		else
			return false;
	}

}
