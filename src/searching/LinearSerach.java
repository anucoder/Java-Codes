/*Linear search is used to search a key element from multiple elements. 
 * Linear search is less used today because it is slower than binary search and hashing.
 */
package searching;
import java.io.*;
import java.util.Scanner;

class LinearSearch
{
	public static void main(String[] args) throws IOException
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
		
		System.out.println("Enter the search element");
		int key = sc.nextInt();
		sc.close();
		
		int i;
		for(i=0;i<n;i++)
		{
			if(ar1[i]==key)
			{
				System.out.print(key+" found at pos "+ i);
				break;
			}
		}
		if(i==n)
			System.out.print(key+" not found");		
	}
}