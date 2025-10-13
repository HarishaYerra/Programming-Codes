/*1. Define a method which returns the sum of three rounded numbers. 
If the right most digit of
the number is less than 5, then round off it&#39;s value to the 
previous multiple of 10 otherwise if
the right most digit of the number is greater or equal to 5, 
then round off to the next multiple
of 10.
Write the method with the following specifications:
Name of method sumOfRoundedValues() // which accepts three integer value as argument
and return the sum of three rounded numbers.
Arguments: three argument of type integer
Return Type: an integer value
Example
If a = 23, b = 34, c = 66
20 + 30 + 70 = 120
If a = 23, b = 37, c = 55
20 + 40 + 60 = 120
Specifications: The value returned by the method sumOfRoundedValues() is determined by
the following rules:
If any of the given number is negative or zero, return -1.
If any of the given numbers right most digit is of the number is
lessthan 5, then round off its
value to the previous multiple of 10 otherwise if the 
right most digit of the number is greater
or equal to 5, then round off to the next multiple of 10. 
*/


package Codes;

import java.util.*;
public class Problem4 {
	public static void main(String args[]) {
		System.out.println("Enter 3 Numbers:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		Problem4 p=new Problem4();
		int res= p.sumOfRoundedValues(num1,num2,num3);
		System.out.println("Sum: " +res);
		
	}

	public int sumOfRoundedValues(int a, int b, int c) {
		if(a<0 ||b<0 ||c<0)
			return -1;
		else {
			a=getConvert(a);
			b=getConvert(b);
			c=getConvert(c);
			int sum= a+b+c;
			return sum;
		}
	}
		public static int getConvert(int num) {
			int r=num%10;
			if(r<=5)
				num=num-r;
			else
				num=num+(10-r);
		
			return num;
		}

}
