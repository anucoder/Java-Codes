/*In this program, we need to find the substring which has been repeated 
 * in the original string more than once*/
 package stringCodes;


import java.io.*;

public class LongestRepeating
{
	public static void main(String[] args) throws IOException
	{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter the String");
		String str = br.readLine();
		String lrs /* = new String[subCount]*/;
		
		StringProcess sp = new StringProcess();
		lrs = sp.longestRepeatingSubstring(str);
		
		System.out.println("Longest Repeating Substring :"+lrs);

		
	}
}