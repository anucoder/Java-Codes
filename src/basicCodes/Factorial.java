package basicCodes;
import java.util.*;

 //Compiler version JDK 11.0.2

 class Factorial
 {
 	public static void main(String args[])
 	{ 
		System.out.println("Enter num");
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		//int num=5;
		sc.close();
		int fact=1;
		
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		
		System.out.println(fact);
 	}
 }