//program to find the largest of an array

package ArrayCodes;

import java.util.Scanner;

public class LargestnSmallest
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
		System.out.println("Largest "+ ap.findLargest(arr));
		System.out.println("Smallest "+ ap.findSmallest(arr));
		
	}
}