/*
Program-16
Write a program to rotate array by k elements clockwise. 
The method takes an integer array and k as input parameters and print the rotated array
Example:
int[] = {10,2,8,1,7,9,11,5,3}
k=2(rotate 2 elements clockwise)
Output:
{8, 1,7,9,11,5,3,10,2}
*/

package Codes;

import java.util.Scanner;

public class Problem33 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c=0;
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        
        System.out.println("Enter K th Element:");
        int k=sc.nextInt();
        int arr2[] = new int[k];
        
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = k; i < n1; i++) {
            arr1[i-k] = arr1[i];
        }
        for (int i = n1-k; i < n1; i++) {
            arr1[i] = arr2[c];
            c++;
        }
        for(int i=0;i<n1;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}
