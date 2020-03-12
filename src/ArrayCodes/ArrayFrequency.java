//program to find the frequency of a number in an array
//find frequency method is defined within arrayprocess class and called here
//right click
package ArrayCodes;

import java.util.Scanner;

public class ArrayFrequency
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
		
		System.out.println("Enter the number to be searched");
		int item = sc.nextInt();
		sc.close();
		
		ArrayProcess ap = new ArrayProcess();
		System.out.print(item+" occured "+ap.findFrequency(arr, item)+" times in array.");
		
	}
}

