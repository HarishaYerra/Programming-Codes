/*3. Move Zeroes

Description:
Given an array, move all the zeros to the end of the array while keeping the order of non-zero elements the same.
Do this in-place without making a copy.

Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]*/

package Codes;

import java.util.*;

public class Problem37 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		
		System.out.println("Enter Array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int pos=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[pos]=arr[i];
				pos++;
			}
		}
			while(pos<n) {
				arr[pos]=0;
				pos++;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
