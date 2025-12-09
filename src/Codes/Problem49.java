
/*Find Pivot Index

Description: Find the index where the sum of the numbers to the 
left of the index is equal to the sum of the numbers to the right.
Return the leftmost pivot index; if none exists, return -1.
Typical approach: Compute total sum, scan while maintaining left sum.
Example: Input: [1,7,3,6,5,6] → Output: 3 (index 3 has left sum 1+7+3=11, right sum 5+6=11)*/

package Codes;

import java.util.*;

public class Problem49 {
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
		
		int total=0;
		for(int x:arr) {
			total+=x;
		}
		
		int left=0;
		
		for(int i=0;i<n;i++) {
			int right=total-left-arr[i];
			if(left==right) {
				System.out.println("Pivot index:" +i);
				return;
			}
		left+=arr[i];
		}
	}
}
