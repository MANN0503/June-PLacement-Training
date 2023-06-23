/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
 import java.util.Scanner;
 
public class printallnumberswithsamedigitsastheupperrange
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter lower range: ");
		int lower = scanner.nextInt();
		
		System.out.println("Enter upper range: ");
		int upper = scanner.nextInt();
		
		int digits = String.valueOf(upper).length();
		
		for(int i = lower; i <= upper; i++) {
		    String number = String.format("%0" + digits + "d", i);
		    System.out.printf(number + " ");
		}
		scanner.close();
	}
}
