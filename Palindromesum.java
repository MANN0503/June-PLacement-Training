import java.util.Scanner;

public class Palindromesum
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter digit N: ");
		int N = scanner.nextInt();
		
		int digit1 = N%10;
		int digit2 = N/10;
		int sum = digit1 + digit2;
		System.out.println("Sum of digits is: " + sum);
		
		int r = 0;
		int sumr = 0;
		int temp = sum;
		while(temp > 0) {
		    r = temp%10;
		    sumr = (sumr * 10) + r;
		    temp = temp/10;
		}
		System.out.println("Reverse number: " + sumr);
		
		System.out.println("Palindrome? ");
		if(sum == sumr) {
		    System.out.println("YES");
		} else {
		    System.out.println("NO");
		}
	
	}
}
