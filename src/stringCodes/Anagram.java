/*program to check whether two strings are anagrams. Anagrams are string that have
same characters, but the order may be different. They have to be of same length. */

package stringCodes;

import java.io.*;
import java.util.*;

public class Anagram
{
	public static void main(String[] args) throws IOException
	{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter the first String");
		String str1 = br.readLine();
		
		System.out.println("Enter the second String");
		String str2 = br.readLine();
		
		if(str1.length()==str2.length())
		{				
		//Converting to character array for Arrays.sort() function.
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		//Sorting the character array so that both strings will be equal.
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//Comparing both strings using Arrays built in equals()  function.
		if(Arrays.equals(ch1, ch2))
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
		}else
			System.out.println("Not anagram");
		//System.out.println(str1+" "+str2);
	}
}