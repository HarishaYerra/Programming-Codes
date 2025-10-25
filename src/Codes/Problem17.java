/*
Write a method that takes one-dimensional array of integers and return an array with only max and min element in that array

Method Name :returnMaxAndMin() 
Argument	: int[]
Return type: int[]

For Example
Input:
{“1”,”5”,”3”,”4”,”2”}

Output:
{“5”,”1”}
*/

package Codes;

import java.util.*;

public class Problem17 {
	public static void main(String args[]) {
		System.out.println("Enter n number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[2];
		System.out.println("Enter numbers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(int i=0;i<n;i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		arr1[0]=max;
		arr1[1]=min;
		System.out.println(Arrays.toString(arr1));
	}
}
