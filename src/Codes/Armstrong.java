package Codes;

import java.util.*;
import java.util.Scanner;

public class Armstrong {
public static void main(String args[]) {
	
	System.out.print("Enter a nomber to check Armstrong Number:");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
	//call Armstrong method
	Armstrong ar = new Armstrong();
	ar.ArmstrongNo(n);
}

public void ArmstrongNo(int n) {
	
	int num=n,sum=0;
	while(n>0) {
		int r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
	if(num==sum)
		System.out.println( num+ " is a Palindrome Number");
	else
		System.out.println( num+"  is not a Palindrome Number");
}
}
