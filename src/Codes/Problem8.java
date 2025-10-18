//Write a method that takes input string and print all the combinations of the string
//Example:
//Input String: abc
//
//Output:
//j
//ja
//jav
//java
//a
//av
//ava
//v
//va
//a



package Codes;

import java.util.*;

public class Problem8{
	public static void main(String args[]) {
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<=s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}
