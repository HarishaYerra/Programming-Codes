/*Program-8

Write a method that takes one-dimensional array of integers and
 pass another integer to the method and
 check if this integer is present in the array and if present 
 return how many times it is present else return 0

Method Name :checkForGivenNumber() 
Argument	: int[], int
Return type: int[]

For Example
Input:
{“1”,”2”,”3”,”4”,”2”}, 2

Output:
2

Input:
{“1”,”2”,”3”,”4”,”2”}, 6

Output:
0
*/

package Codes;

import java.util.*;

public class Problem19 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of first array:");
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0;i<n1;i++) {
    	arr1[i]=sc.nextInt();
    }
    System.out.println("Enter search element:");
    int ele = sc.nextInt();
    System.out.println(searchElement(arr1,ele));
    }
	
	public static int searchElement(int arr1[],int ele) {
		int c=0;
		for(int i=0;i<arr1.length;i++) {
			if(ele==arr1[i]) {
				c++;
			}
		}
		return c;
	}
		
}
