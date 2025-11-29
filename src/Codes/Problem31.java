

package Codes;
/*Program-14
Write a program that finds the kth smallest element in an integer array, which is unsorted
Example:
int[] = {10,2,8,1,7,9,11,5,3}
k=2
Output:
The 2nd smallest element is 2
*/

import java.util.*;

public class Problem31 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter K th Element:");
        int k=sc.nextInt();
        
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
            
        }
        Arrays.sort(arr1);
        System.out.println(arr1[k-1]);
	}
}
