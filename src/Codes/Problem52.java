
/*Container With Most Water

Description: Given n non-negative integers representing heights at positions,
find two lines such that together with the x-axis they form a container that holds the most water. Return the maximum area.
Typical approach: Two-pointer from ends, move the smaller height inward.
Example: Input: [1,8,6,2,5,4,8,3,7] → Output: 49*/

package Codes;

import java.util.*;

public class Problem52 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter number of heights:");
	        int n = sc.nextInt();

	        int[] height = new int[n];
	        System.out.println("Enter heights:");
	        for (int i = 0; i < n; i++) {
	            height[i] = sc.nextInt();
	        }

	        int maxArea = maxArea(height);
	        System.out.println("Maximum area: " + maxArea);
	    }
	 public static int maxArea(int[] height) {
	        int left = 0;
	        int right = height.length - 1;
	        int max = 0;

	        while (left < right) {
	            int width = right - left;
	            int h = Math.min(height[left], height[right]);
	            int area = width * h;

	            max = Math.max(max, area);

	            // Move the smaller height inward
	            if (height[left] < height[right]) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        return max;
	 }
}
