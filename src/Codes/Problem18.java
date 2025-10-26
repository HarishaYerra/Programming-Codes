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
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Problem18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(resultSubset(arr1, arr2));
    }

    public static boolean resultSubset(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (!set.contains(num))
                return false;
        }
        return true;
    }
}
