/*In this program, we need to find all permutations of characters in substring */
 
package stringCodes;

import java.io.*;

public class Permutations
{
	public static void main(String[] args) throws IOException
	{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter the String");
		String str = br.readLine();
		String[] pSet /* = new String[subCount]*/;
		
		StringProcess sp = new StringProcess();
		pSet = sp.generatePermutations(str);
		
		System.out.println("All perumtaions of string,"+str+" :");
		for(int i=0;i<pSet.length;i++)
		{
			System.out.println(pSet[i]);
		}
		
	}
}