/*Program-11	

Write a method that takes integer array as input and 
find two elements in the array whose sum is equal to Zero, 
if there are no elements then return 0
*/

package Codes;

import java.util.*;

public class Problem20 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size of first array:");
	    int n1 = sc.nextInt();
	    int[] arr1 = new int[n1];
	    for(int i=0;i<n1;i++) {
	    	arr1[i]=sc.nextInt();
	    }
	    for(int i=0;i<n1;i++) {
	    	for(int j=0;j<n1;j++) {
	    		if((arr1[i]+arr1[j])==0)
	    			System.out.println(1);
	    	}
	    }
	    System.out.println(0);
	}
}
