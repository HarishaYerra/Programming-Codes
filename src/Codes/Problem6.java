/*6. Write a method which accepts two string parameters, find out the count the number of
occurrence of second parameter in the first parameter
Method Name countWord
Argument String and String
Return Type Int
Example First parameter: hello world, world is

wonderful
Second parameter: world
Output:2*/

package Codes;

import java.util.*;
public class Problem6 {
	public static void main(String args[]) {
		System.out.println("Enter 2 Strings: ");
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		String s2=sc.nextLine();
		StringTokenizer ob =new StringTokenizer(s1," ");
		int c=0;
		while(ob.hasMoreTokens()) {
			String t=ob.nextToken();
			if(t.equals(s2)) 
				c++;
		}
		System.out.println(c);
	}
	
}
