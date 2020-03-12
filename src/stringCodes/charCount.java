//program to count the number of characters, punctiations, spaces in a string.
package stringCodes;

import java.io.*;

public class charCount
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the Sentence");
		//Scanner s = new Scanner(System.in);
		//String str = s.next();
		//s.close();
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = br.readLine();
		
		System.out.println("Here are the results for the String '"+str+"'");
		StringProcess sp = new StringProcess();
		System.out.println("Number of characters :"+sp.getCharCount(str));
		System.out.println("Number of punctuations :"+sp.getPunctCount(str));
		System.out.println("Number of spaces :"+sp.getSpaceCount(str));
	}
}