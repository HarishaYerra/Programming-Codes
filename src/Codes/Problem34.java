/*Program-17
There is an array of integers, write a method that takes this array as input, 
rearrange the array such that elements at even index (even starts from 0) are greater than 
elements at odd index
Example:
int[] = {10,2,8,1,7,9,11,5,3}
Output:
{11, 1,10,2,9,3,8,5,7}

*/

package Codes;


import java.util.Arrays;
import java.util.Scanner;

public class Problem34 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c=1;
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n1];
        
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr2.length;i++) {
        	if(i%2==0) {
        		arr2[i]=arr1[n1-1];
        		n1--;
        	
        	}
        	else {
        		arr2[i]=arr1[i-c];
        		c++;
        	}
        }
        for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}
