
package Codes;

import java.util.*;

public class Problem15 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int rowsum[] = new int[3]; // to store row sums

        System.out.println("Enter 9 numbers for 3x3 matrix:");

        // taking input
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        // calculating row-wise sum
        for(int i=0; i<3; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum += arr1[i][j];
            }
            rowsum[i] = sum;
        }

        // printing output
        System.out.println("Row-wise Sum:");
        for(int i=0; i<3; i++){
            System.out.print(rowsum[i] + " ");
        }
    }
}

