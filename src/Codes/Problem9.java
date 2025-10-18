/* Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .
Method Name getImage 
Argument :String 
Return Type :String 
For Example 
Input : EARTH 
Output : EARTH|HTRAE */

package Codes;

import java.util.*;

public class Problem9 {
	public static void main(String args[]) {
		System.out.println("Enter a string:");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		Problem9 p=new Problem9();
		String st=p.reverse(s);
		System.out.println(st);
	}
		public String reverse(String st) {
			String str=" ";
			for(int i=st.length()-1;i>=0;i--) {
				str+=st.charAt(i);
			}
			return st+"|"+str;
		}
	
}
