/*
Program-4

Create a class that contains a method which takes 2-dimensional array of integers and get the transpose(rows becomes columns becomes rows)

Method Name :getTranspose() 
Argument	: int[][]
Return type: int[][]

For Example
Input:
1 2 
3 4
Output:
1 3
2 4
*/

package Codes;

import java.util.*;

public class Program23 {
    public static void main(String args[]) {
        int arr[][] = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        // Transpose will have swapped dimensions
        int arr1[][] = new int[arr[0].length][arr.length];

        System.out.println("Original Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr1[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

