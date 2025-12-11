
/*Sort Colors (Dutch National Flag)

Description: Given an array with values 0, 1, and 2, sort the array in-place so that all
 0s come first, then 1s, then 2s. Do it in one pass with constant space.
Typical approach: Three pointers: low, mid, high.
Example: Input: [2,0,2,1,1,0] → Output: [0,0,1,1,2,2]*/

package Codes;

import java.util.*;

public class Problem51 {
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
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
