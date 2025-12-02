/*5. Find the Single Number

Description:
In an array, every number appears twice except one number that appears only once.
Find that single number.

Example:
Input: [4,1,2,1,2]
Output: 4*/

package Codes;

import java.util.*;

public class Problem39 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		
		System.out.println("Enter Array elements:");
		for(int i=0;i<n; i++) {
			arr[i]=sc.nextInt();
			
		}
		List<Integer> list= new ArrayList<>();
		for(int i:arr) {
			list.add(i);
		}
		Set<Integer> set= new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		int c=0;
		for(int i:set) {
			if(list.contains(i) && c>1)
				continue;
			else
				System.out.println(c);
		}
	}
}
