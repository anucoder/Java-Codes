//program to find the sum of an array

package ArrayCodes;

import java.util.Scanner;

public class ArraySum
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
		System.out.print("Sum of the array is "+ ap.findSum(arr));
		
	}
}