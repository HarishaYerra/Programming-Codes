/*Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
For Example 
ANT is a positive String (Since T comes after N and N comes after A) 
APPLE is not positive since L comes before P in the alphabetical order. 
The method should return true if the entered string is positive
Method Name :checkPositive 
Argument :String 
Return Type :boolean 
Algorithm	Step 1: Convert to Char array. 
Step 2: Iterate through array, subtract 1st two characters (A-N). This will give the ASCII difference 
Step 3: If result is negative, then return false and break. Else continue to next loop*/


package Codes;

import java.util.*;
public class Problem3 {
	public static void main(String args[]) {
		System.out.print("Enter a String: ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		//System.out.println("\n");
		Problem3 p=new Problem3();
		boolean res=p.getResults(str);
		if(res) {
			System.out.println("Positive String");
		}
		else {
			System.out.println("Negative String");
		}
		
		
	}
	 
	public boolean getResults(String str) {
		boolean res=false;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length()-1;i++) {
			if((int)ch[i]>(int)ch[i+1]) {
				res=false;
				break;
			}
			else
				res=true;
		}
		
		return res;
	}
}
