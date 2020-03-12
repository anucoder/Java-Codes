/*Binary search is used to search a key element from multiple elements. 
 * Binary search is faster than linear search. In case of binary search, 
 * array elements must be in ascending order. If you have unsorted array, 
 * you can sort the array using Arrays.sort(arr) method.*/

package searching;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class BinaryRecur
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
		
		System.out.println("Sorted array");		
		for(int i=0;i<n;i++)
		{
			System.out.print(ar1[i]+" ");	
		}
		
		int first = 0, last = ar1.length-1;
		BinaryRecur b = new BinaryRecur();
		int pos = b.binarySearch(ar1, first, last, key);
		if(pos==-1)
			System.out.println("Not found");
		else
			System.out.println(key+" found at pos "+pos);
		sc.close();
	}
	
	int binarySearch(int ar1[],int first,int last,int key)
	{
		
		//Binary Search		
		
		
		if(first<=last)
		{
			int mid = first+(last-first)/2;
			if(ar1[mid]<key)
				return binarySearch(ar1,mid+1,last,key);

			else if(ar1[mid]==key)
				return mid;
			
			else
				return binarySearch(ar1,first,mid-1,key);
	
		}		
		// We reach here when element is not present 
        // in array
		 return -1;
			
	}
}