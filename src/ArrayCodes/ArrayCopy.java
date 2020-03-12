//In this program, we need to copy all the elements of one array into another. 
//This can be accomplished by looping through the first array and 
//store the elements of the first array into the second array at the corresponding position.

package ArrayCodes;

import java.util.*;

class ArrayCopy
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		
		System.out.println("Enter the Array elements");
		int ar1[] = new int[n];
		for(int i=0;i<n;i++)
		{
			ar1[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("Array1 created..\nCopying elements to array2\n");
		
		int ar2[] = new int[n];	
		for(int i=0;i<n;i++)
		{
			ar2[i] = ar1[i];
			System.out.println("Copied "+ar2[i]+" on position "+i);
		}
		
		System.out.println("Final Array2");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar2[i]+" ");
		}
	}
}