/*2. Remove Duplicates from Sorted Array

Description:
You are given a sorted array. Remove the duplicate elements in-place so that each element appears only once.
Return the count of unique elements.
The first part of the array should contain the unique values.

Example:
Input: [1,1,2,2,3]
Output: 3 (array becomes [1,2,3,_,_])*/


package Codes;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class Problem36 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter Array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int c=0;
		Set<Integer> set = new LinkedHashSet<>();
		for(int i : arr) {
			set.add(i);
		}
		for(int i: set) {
			
			c++;
		}
		System.out.println(c);
	}
	
}
