
/*2) Two Pointers
3Sum

Description: Given an integer array, return all unique triplets [a,b,c]
 such that a + b + c = 0. Triplets must not be duplicated.
Typical approach: Sort + fix one element + two-pointer for the other two.
Example: Input: [-1,0,1,2,-1,-4] → Output: [[-1,-1,2],[-1,0,1]]&*/

package Codes;

import java.util.*;

public class Problem50 {
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
}
