/*
There are 2 arrays with integers, write a method that takes input as
 these 2 arrays and find the common elements or intersection between these 2 arrays
Example:
int[] x1 = {2,4,5,7,8}
int[] x2 = {1,2,8}
Output:
Common elements: {2,8}
*/

package Codes;

import java.util.*;

public class Problem30 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[3];
        int arr3[] = new int[3];
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        List<Integer> list3= new ArrayList<>();
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
            list1.add(arr1[i]);
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
            list2.add(arr2[i]);
        }
        for(int i:list2) {
        	if(list1.contains(i)){
        		list3.add(i);
        	}
        }
        System.out.println(list3);
	}
}
