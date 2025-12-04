/*8. Right Rotate Array by 1

Description:
Rotate the array elements one position to the right.
The last element moves to the front.

Example:
Input: [1,2,3,4,5]
Output: [5,1,2,3,4]*/

package Codes;

import java.util.Arrays;
import java.util.*;

public class Problem42 {
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
		int num=arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr1[i]=arr[i-1];
		}
		arr1[0]=num;
		System.out.println(Arrays.toString(arr1));
	}
}
