package basicCodes;

//import java.util.*;
import java.io.*;

class Palindrome
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter the number Sequence :");
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String s = br.readLine();
		int num = Integer.parseInt(s);
		//System.out.println(num+5);
		
		if(isPalindrome(num))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
	
	public static boolean isPalindrome(int num)
	{
		int rem = 0, newnum=0,oldnum=num;
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			newnum = newnum*10+rem;
		}
		
		//System.out.println("newnum :"+newnum);
		//System.out.println("newnum :"+oldnum);
		
		if(newnum==oldnum)
			return true;
		else
			return false;
	}
}