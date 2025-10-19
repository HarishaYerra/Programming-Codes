/*Example:Input:6.77
		Output:6:14
Example:Input:32.77
		Output:5:14
Example:Input:35
		Output:9:0
		*/

package Codes;
import java.util.*;
public class Problem10{
	public static void main(String args[]) {
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		double s=sc.nextDouble();
		String st=String.valueOf(s);
		String[] res=st.split("[.]",0);
		int sum=0;
		int arr[]= new int[res.length];
		Problem10 p=new Problem10();
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(res[i]);
		}
	
		int sum1=p.sumOfDigits(arr[0]);
		int sum2=p.sumOfDigits(arr[1]);
		System.out.println(sum1+ ":" +sum2);
		
	}
		public int sumOfDigits(int num) {
			int sum=0;
			while(num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				num/=10;
				
			}
			return sum;
		
	}
}