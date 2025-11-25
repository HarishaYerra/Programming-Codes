/*Program-11	

Write a method that takes integer array as input and 
find two elements in the array whose sum is equal to Zero, 
if there are no elements then return 0
*/

package Codes;

import java.util.*;

public class Problem29 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n1; i++) {
        	for (int j = 0; j < n1; j++) {
                if(arr1[i]+arr1[j]==0) {
                	a=arr1[i];
                	b=arr1[j];
                }
            }
        }
        System.out.println(a+","+b);
	}
}
