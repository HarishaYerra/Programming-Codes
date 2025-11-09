/*Program-3
Create a class that contains a method which takes two-dimensional array of integers(array has equal number of rows and columns) and calculate the sum of diagonal element starting from 1st column

Method Name :getDiagonalDataSum() 
Argument	: int[][]
Return type: int
For Example
Input:
1 2 
3 4
Output:
5
*/


package Codes;

import java.util.*;
public class Problem22 {

	public static void main(String args[]) {
		int sum=0;
		int arr[][]= {{1,2},{3,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j)
					sum+=arr[i][j];
			}
		}
		System.out.print(sum);
	}
}
