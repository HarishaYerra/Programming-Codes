
/*1) Prefix Sum / Kadane / Subarrays
Maximum Subarray (Kadane’s Algorithm)

Description: Given an integer array, find the contiguous subarray (containing at least one number) 
which has the largest sum and return its sum.
Typical constraints: O(n) time, O(1) extra space.
Example: Input: [-2,1,-3,4,-1,2,1,-5,4] → Output: 6 (subarray [4,-1,2,1])

*/
package Codes;

import java.util.*;

public class Problem45 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxSubArray(arr);
        System.out.println("Maximum subarray sum: " + result);
    }

    public static int maxSubArray(int[] arr) {
    	int currentSum=arr[0];
    	int maxSum=arr[0];
    	
    	for(int i=1;i<arr.length;i++) {
    		currentSum=Math.max(arr[i], currentSum +arr[i]);
    		maxSum= Math.max(maxSum, currentSum);
    	}
    	return maxSum;
    }
}
