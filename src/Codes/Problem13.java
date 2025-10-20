/*SquareRoot of a number*/

package Codes;

import java.util.*;

public class Problem13 {
		public static void main(String args[]) {
			System.out.println("Enter a Number: ");
			Scanner sc= new Scanner(System.in);
			int s=sc.nextInt();
			Problem13 p=new Problem13();
			boolean res = p.square_root(s);

	        if (res)
	            System.out.println(s + " is a perfect square.");
	        else
	            System.out.println(s + " is NOT a perfect square.");
		}
		public boolean square_root(int num) {
			boolean res=false;
			for(int i=1;i<num;i++) {
				if((num%i==0) && (num/i==i)) {
					res=true;
					break;
				}
			}
			return res;
		}
}
