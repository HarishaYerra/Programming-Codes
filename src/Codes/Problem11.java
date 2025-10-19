package Codes;

/*6. Write a method which accepts a String and moves all the lower case ‘a’ to the beginning of
the String.
Method Name rearrangeCharacters
Argument String
Return Type String
Algorithm 1. Convert the string to a character array
2. Create a Stringbuffer object
3. Create a variable(count) to store the
number of ‘a’ present
4. Iterate over the character array and if the
character is ‘a’ increment count for ‘a’ else
add the character to the StringBuffer object.
5. Finally insert the count number of ‘a’ to
the beginning of the StringBuffer object
*/
import java.util.*;
public class Problem11{
	public static void main(String args[]) {
		System.out.println("Enter a String: ");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		Problem11 p=new Problem11();
		System.out.println(p.rearrangeCharacters(s));
	}
	public String rearrangeCharacters(String s) {
		String st="",m="",str="";
		int c=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				c++;
			}
			else {
				st+=ch[i];
			}
		}
		for(int i=0;i<c;i++) {
			m+='a';
		}
		str=m+st;
		return str;
	}
}
	