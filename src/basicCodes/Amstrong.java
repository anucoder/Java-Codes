package basicCodes;

//import java.util.*;
import java.io.*;
//Sum of the cubes of the digits will be equal to that number
//eg.153, 370, 371, 407
class Amstrong
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter a three digit :");
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String s = br.readLine();
		int num = Integer.parseInt(s);
		//System.out.println(num+5);
		
		if(isAmstrong(num))
			System.out.println("Amstrong");
		else
			System.out.println("Not Amstrong");
		
	}
	
	public static boolean isAmstrong(int num)
	{
		int rem = 0, newnum=0,oldnum=num;
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			newnum = newnum + (int) Math.pow(rem, 3);
			//System.out.println("newnum :"+newnum);
		}
		
		//System.out.println("*newnum :"+newnum);
		//System.out.println("*oldnum :"+oldnum);
		
		if(newnum==oldnum)
			return true;
		else
			return false;
	}
}