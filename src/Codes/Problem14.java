/*
Program-1
Create a class 'IncreaseDecrease' containing  amethod method that creates and returns array of numbers for a given integer as parameter in a format like one is small next number is big....
Method Name :getIncreaseDecrease
Arguments : One Integer 
Return Type :int Array
For Example
Input : 5
Output: array with values: {1,5,2,4,3}
*/

package Codes;

import java.util.*;

public class Problem14 {

	public static void main(String args[]) {
		int c=1;
		System.out.print("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=s;
		int arr[]=new int[s];
		for(int i=0;i<s;i++) {
			if(i%2==0) {
				arr[i]=c;
				c++;
			}
			else {
				arr[i]=t;
				t--;
			}
		}
		System.out.print("{");
		for(int i=0;i<s;i++) {
			System.out.print(","+arr[i]);
		}
		System.out.print("}");
	}
}
