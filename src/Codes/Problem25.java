/*Write a method that takes two one-dimensional arrays integers, and determine if one array is subset of other

Method Name :returnSubSet() 
Argument	: int[], int[]
Return type: true

For Example
Input:
{“1”,”2”,”3”,”4”,”5”}
{“1,”4”,”5”}

Output:
true
*/
package Codes;

import java.util.*;

public class Problem25 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean result = returnSubSet(arr1, arr2);

        System.out.println(result);
    }

    // METHOD TO CHECK SUBSET
    public static boolean returnSubSet(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        // Insert all elements of arr1 into set
        for (int x : arr1) {
            set.add(x);
        }

        // Check if every element of arr2 exists in arr1
        for (int y : arr2) {
            if (!set.contains(y)) {
                return false;   // if any element missing → not a subset
            }
        }

        return true; // all elements found → subset
    }
}
