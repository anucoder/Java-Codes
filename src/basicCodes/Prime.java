package basicCodes;
import java.util.*;

class Prime
{
	public static void main(String args[])
	{
		int lim;
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		lim = sc.nextInt();
		//prime = new int[lim];		
		sc.close();
		

		
		for(int i=2;i<lim;i++)
		{
			isPrime = true;
			for(int j=1;j<=i/2;j++)
			{
				//System.out.println("\nhey , i'm "+ i);
				if(i%j==0 && j!=1)
				{
					isPrime = false;
					//if(i==3) 
						//System.out.println("I got divided by " + j + "! Wow");
					break;
				}
				
			}
			if(isPrime)
			{
				System.out.print(i+" ");
			}

		}	
		
		//ArrayProcess processor = new ArrayProcess();		
		//processor.arrayTraverse(prime);
	}	

}

