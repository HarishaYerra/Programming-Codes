
/*Squares of a Sorted Array

Description: Given a sorted array of integers (could be negative), return a new array of the squares of each number,
also sorted. Do it in O(n) time without extra sort.
Typical approach: Two-pointer from ends, place larger square at the end of result array.
Example: Input: [-4,-1,0,3,10] → Output: [0,1,9,16,100]*/

package Codes;

import java.util.Arrays;
import java.util.Scanner;

public class Problem54 {
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
			arr[i]=arr[i]*arr[i];
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
