//program to find all duplicate elements in an array

package ArrayCodes;

import java.util.Scanner;

public class DuplicateNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		
		System.out.println("Enter the Array elements");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		ArrayProcess ap = new ArrayProcess();
		ap.findDuplicate(arr);
		int len = ap.remDuplicate(arr);
		
		System.out.println("\nAfter removing duplicated elements");
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}