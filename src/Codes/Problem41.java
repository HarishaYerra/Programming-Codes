/*7. Left Rotate Array by 1

Description:
Rotate the array elements one position to the left.
The first element moves to the end.

Example:
Input: [1,2,3,4,5]
Output: [2,3,4,5,1]*/

package Codes;

import java.util.*;

public class Problem41 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int num=0;
		int arr[]=new int[n];
		int arr1[]=new int[n];
		System.out.println("Enter Array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		num=arr[0];
		for(int i=0;i<n-1;i++) {
			arr1[i]=arr[i+1];
		}
		arr1[n-1]=num;
		System.out.println(Arrays.toString(arr1));
	}

}
