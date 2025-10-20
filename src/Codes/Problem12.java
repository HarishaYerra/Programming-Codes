/*Distinct Element*/

package Codes;

import java.util.*;
public class Problem12 {
	public static void main(String args[]) {
		System.out.println("Enter n numbers: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		distinct_elements(arr,n);
	}
//	distinct_elements() should be static
//
//	You’re calling it directly from main() without creating an object.
//
//	Since main() is static, non-static methods can’t be called directly.
	public static void distinct_elements(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(arr[i]==arr[j])
					break;
			}
			if(i==j) {
				System.out.println(arr[i]);
			}
		}
	}
}
