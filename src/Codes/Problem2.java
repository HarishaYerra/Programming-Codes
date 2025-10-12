/*Create a method which can perform a particular String operation based on the user’s choice. The method should accept the String object and the user’s choice and return the output of the operation. 
Options are 
A: Add the String to itself 
B: Replace alternate positions with * 
C: Remove duplicate characters in the String 
D: Change alternate characters to upper case*/
/* Create a method to check if a number is an increasing number*/


package Codes;

import java.util.Scanner;

public class Problem2 {
	public static void main(String args[]) {
		System.out.print("Enter a String: ");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		System.out.print("\n");
		System.out.print("Enter your choice: ");
		char c=s.next().charAt(0);
		Problem2 p= new Problem2();
		String res=p.getResult(str, c);
		System.out.println(res);
	}
	
	  String getResult(String str, char c) {
		String st=" ";
		switch(c){
		
//		A: Add the String to itself 
			case 'A':
			case 'a':
				st= str+" "+str;
				break;
				
//		B: Replace alternate positions with * 
			case 'B':
			case 'b':
				for(int i=0;i<str.length();i++) {
					if(i%2!=0)
						st+='*';
					else
						st+=str.charAt(i);
				}
				break;
				
//		C: Remove duplicate characters in the String 
			case 'C':
			case 'c':
				for(int i=0;i<str.length();i++) {
					int j=0;
					for(j=0;j<i;j++) {
						if(str.charAt(i)==str.charAt(j))
							break;
					}
					if(i==j)
						st+=str.charAt(i);
					
				}
				break;
			
				
//		D: Change alternate characters to upper case*/
			case 'D':
			case 'd':
				for(int i=0;i<str.length();i++) {
					if(i%2!=0)
						st+=Character.toUpperCase(str.charAt(i));
					else
						st+=str.charAt(i);
				}
				break;
				
			default:
				System.out.println("Invalid operation no::");
		
		}
		return st;
	}
}
