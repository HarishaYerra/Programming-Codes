
/*Pair with Target Sum (Two Pointer version)

Description: Given a sorted array and a target sum, return indices (or boolean) of a pair that sums to the target.
Use two pointers for O(n) time.
Example: Input: nums = [1,2,3,4,6], target = 6 → Output: [1,3] (1-based indices) or (2,4) zero-based*/

package Codes;

import java.util.*;

public class Problem53 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int a=0,b=0;
		int arr[]=new int[n];
		int target=sc.nextInt();
		System.out.println("Enter Array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					a=i;
					b=j;
					break;
				}
			}
		}
		System.out.println("["+a+","+b+"]");
	}
}
