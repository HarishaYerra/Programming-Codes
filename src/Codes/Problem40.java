/*6. Second Largest Element in Array

Description:
Find the second largest number in a given array.
If the second largest does not exist (e.g., all elements are same), return a suitable indicator like -1.

Example:
Input: [12, 35, 1, 10, 34, 1]
Output: 34*/

package Codes;

import java.util.Arrays;
import java.util.Scanner;

public class Problem40 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		
		System.out.println("Enter Array elements:");
		for(int i=0;i<n; i++) {
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println((arr[n-2]));
	}
}
