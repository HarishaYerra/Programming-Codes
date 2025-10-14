/*5. Write a method which accepts an email in a form of String and validate that email values
based on the following rules
1) There should be only one @
2) There should be one com
3) There should be only 5 characters between @ and .
Method Name validateEmail
Argument String
Return Type Boolean*/

package Codes;


import java.util.*;

public class Problem5 {
	public static void main(String args[]) {
		System.out.print("Enter You Email:");	
		Scanner sc= new Scanner(System.in);
		String st=sc.nextLine();
		Problem5 p= new Problem5();
		boolean res=p.validateEmail(st);
		if(res)
			System.out.println("Entered Email is valid");
		else
			System.out.println("Entered Email is not valid");
	}
	
	public boolean validateEmail(String st) {
		boolean res=false;
		int firstIndex=st.indexOf('@');
		int lastIndex=st.lastIndexOf('@');
		int dotIndex=st.lastIndexOf('.');
		int len=(st.substring(firstIndex+1,dotIndex)).length();
		String checkCom=st.substring(dotIndex+1); 
		if(firstIndex==lastIndex && len==5 && checkCom.equals("com")) 
			res=true;
		else
			res=false;
		return res;
				
		}
		
	}
