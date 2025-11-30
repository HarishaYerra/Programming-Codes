/*Description:
Given an array of integers and a target value, return the indices of the two numbers that add up to the target.
You must return any one pair, and you cannot use the same element twice.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]*/

package Codes;

import java.util.*;

public class Problem35 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		System.out.println("Enter target element:");
		int target=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[2];
		System.out.println("Enter Array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					arr[0]=i;
					arr[1]=j;
				}
			}
		}
	}
}
