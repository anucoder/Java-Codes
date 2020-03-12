package basicCodes;
import java.util.*;
import ArrayCodes.ArrayProcess;

class Fibonacci
{
	public static void main(String args[])
	{
		int lim,fib[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		lim = sc.nextInt();
		fib = new int[lim];		
		sc.close();
		
		fib[0]= 0;
		fib[1]= 1;
		
		for(int i=2;i<lim;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			//fib[i-1]= fib[i];
		}	
		
		ArrayProcess processor = new ArrayProcess();		
		processor.arrayTraverse(fib);
	}	

}

