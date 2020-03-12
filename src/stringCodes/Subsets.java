/*program to print all the subsets of java. A java string of length n will have n(n+1)/2 subsets */

package stringCodes;

import java.io.*;

public class Subsets
{
	public static void main(String[] args) throws IOException
	{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter the String");
		String str = br.readLine();
		String[] subsets /* = new String[subCount]*/;
		
		StringProcess sp = new StringProcess();
		subsets = sp.findAllSubsets(str);
		
		System.out.println("Subsets :");
		for(int i=0;i<subsets.length;i++)
		{
			System.out.println(subsets[i]);
		}
		
	}
}