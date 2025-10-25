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

public class Problem16 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int diagonalsum =0; // to store row sums

        System.out.println("Enter 9 numbers for 3x3 matrix:");

        // taking input
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        // calculating row-wise sum
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
            	if(i==j)
            		diagonalsum += arr1[i][j];
            }
        }

        System.out.println(diagonalsum);
    }
}


