/*Binary search is used to search a key element from multiple elements. 
 * Binary search is faster than linear search. In case of binary search, 
 * array elements must be in ascending order. If you have unsorted array, 
 * you can sort the array using Arrays.sort(arr) method.*/

package searching;
import java.io.*;
import java.util.*;

class BinarySerach
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
		
		//sorting the array
		Arrays.sort(ar1);
		
		System.out.println("Enter the search element");		
		int key = sc.nextInt();
		sc.close();
		
		
		System.out.println("Sorted array");		
		for(int i=0;i<n;i++)
		{
			System.out.print(ar1[i]+" ");	
		}
		
		//Binary Search
		int first = 0, last = ar1.length-1;
		int mid = (first+last)/2;
		
		while(first<=last)
		{
			if(ar1[mid]<key)
			{
				first = mid+1;
			}
			else if(ar1[mid]==key)
			{
				System.out.println(key+" found at pos "+mid);
				break;
			}
			else
			{
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		
		if(first>last) System.out.println(key+" not found");
			
	}
}