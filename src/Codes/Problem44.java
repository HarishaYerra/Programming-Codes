/*10. Check if Array is Sorted

Description:
Determine whether the given array is strictly increasing or non-decreasing.
Return true if sorted, otherwise false.

Example:
Input: [1,2,3,4,5] → true
Input: [1,3,2,4] → false*/

package Codes;

import java.util.*;

public class Problem44 {
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
		boolean res=increasing(arr);
		System.out.println(res);
	}
		
		public static  boolean increasing(int arr[]) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<arr[i-1])
					return false;
			}
		return true;
	}
}
