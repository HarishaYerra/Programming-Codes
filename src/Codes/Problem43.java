/*9. Count Even and Odd Numbers in Array

Description:
Given an array, count how many numbers are even and how many are odd.
Return both counts.

Example:
Input: [1,2,3,4,5,6]
Output: Even = 3, Odd = 3*/

package Codes;

import java.util.Scanner;

public class Problem43 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		System.out.println("Enter Array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int even=0,odd=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) 
				even++;
			else
				odd++;
		}
		System.out.println("Even =" +even + ", Odd =" + odd );
	}
}
