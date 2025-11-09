/* Write a method that takes an array of strings, from the array determine the equal strings,
 put in another String array, and return the result.
 If there are no equal strings found return empty array

Method Name :getEqualStrings() 
Argument	: String[]
Return type: String[]

For Example
Input:
{“hello”,”how”,”hello”,”test”,”how”}
Output:
{“hello”,”how”}
*/

package Codes;

import java.util.*;
public class Problem24 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String str[]=new String[size];
		for(int i=0;i<size;i++) {
			str[i]=sc.next();
		}
		String res[]=getEqualStrings(str,size);
		for(int i=0;i<=res.length;i++){
			System.out.println(res[i]+" ");
		}
	}
	public static String[] getEqualStrings(String[] str,int size) {
		int c=0;
		String res[]=new String[size];
		for(int i=0;i<str.length-1;i++) {
			for(int j=i+1;j<str.length;j++) {
			if(str[i].equals(str[j]) && (i!=j)) {
				res[c]=str[i];
				c++;
			}
		}
	}
	return res;
	}
	
}

