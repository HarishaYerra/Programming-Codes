/*Program-12	
Write a program that takes integer or string array with repeated 
elements and determine the elements that are repeated odd number of times in the array.
Example:
Input:
int[]  x = {2,2,3,2,3,4,1,5,5,7}
Output:
The elements that are repeated odd number of times
2 repeated 3 times
4 repeated 1 time
1 repeated 1 time
7 repeated 1 time
*/

package Codes;

import java.util.*;

public class Problem27 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        Set<Integer> set= new HashSet<>();
        for(int i:arr1) {
        	set.add(i);
        }
        
        for(int i:set) {
        	int c=0;
        	for(int j:arr1) {
        		if(i==j)
        			c++;
        	}
        System.out.println(i+" repeated "+c+" times");
	}
	}

}
