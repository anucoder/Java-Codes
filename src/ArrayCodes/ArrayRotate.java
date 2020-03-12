//program to find the frequency of a number in an array
//find frequency method is defined within arrayprocess class and called here
//right click
package ArrayCodes;

import java.util.Scanner;

public class ArrayRotate
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
		
		System.out.println("Enter the number of positions");
		int pos = sc.nextInt();
		sc.close();
		
		ArrayProcess ap = new ArrayProcess();
		
		ap.leftRotate(arr, pos);		
		System.out.println("New array after left rotation");
		ap.arrayTraverse(arr);
		
		ap.rightRotate(arr, pos);		
		System.out.println("\nNew array after right rotation");
		ap.arrayTraverse(arr);
		
	}
}