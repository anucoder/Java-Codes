/**
 * 
 */
package basicCodes;
import java.util.Scanner;

/**
 * @author eanagsa
 *The code creates a Scanner object named sc and uses it to read a String and an int. 
 *It then closes the Scanner object because there is no more input to read, 
 *and prints to stdout using System.out.println(String). 
 */

public class ReadInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mystr = sc.nextLine();
		int myint = sc.nextInt();
		
		System.out.println("myString is : "+mystr);
		System.out.println("myInt is : "+myint);
		
		sc.close();		
	}

}
