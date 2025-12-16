
/*Subarray Sum Equals K

Description: Given an integer array and an integer k, return the number of contiguous subarrays whose sum equals k.
Typical approach: Prefix-sum + HashMap to count previous prefix sums.
Example: Input: nums = [1,1,1], k = 2 → Output: 2 (subarrays [1,1] at indices (0,1) and (1,2))*/

package Codes;

import java.util.Map;

public class Problem46 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter k:");
        int k = sc.nextInt();
        
        int res= subArraySum(nums,k);
        System.out.println("Number of aubarrays with sum"+k+"="+res);
        
	}
	
	public static int subArraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		
		int sum =0;
		int coumt=0;
		
		for(int num :nums)
	}
	
}
