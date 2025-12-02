/*4. Find Missing Number

Description:
You are given an array containing numbers from 0 to n, but one number is missing.
Find the missing number.

Example:
Input: [3,0,1]
Output: 2*/

package Codes;

import java.util.*;

public class Problem38 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		
		System.out.println("Enter Array elements:");
		for(int i=0;i<n; i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		int exp=n*(n+1)/2;
		
		System.out.println(exp-sum);
	}
}
