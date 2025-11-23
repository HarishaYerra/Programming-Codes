/*Program-10	

Write a method that takes one-dimensional array of integers and return the first no-repeating element index position in an array of integers

Method Name :getFirstNonRepeatingElement() 
Argument	: int[]
Return type: int

For Example
Input:
{“1”,”2”,”3”,”4”,”2”}

Output:
0
*/

package Codes;



import java.util.*;

public class Problem28 {
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int index=-1;
	        System.out.println("Enter size of first array:");
	        int n1 = sc.nextInt();
	        int arr1[] = new int[n1];

	        System.out.println("Enter elements of first array:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }
	        
	        for(int i=0;i<n1;i++) {
	        	int j;
	        	for(j=0;j<n1;j++) {
	        		if(i!=j && arr1[i]==arr1[j]) {
	        			index=-1;
	        			break;
	        		}
	        		
	        		}
	        	if(j==n1) {
        			index=i;
        			break;
	        	}
	        	
	        }
	        System.out.println(index);
		}
	}
