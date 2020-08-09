import java.util.Scanner;

public class DivisorCalc {

	public static void main(String[] args) {

		// Initializing num1 and num2 and creating scanner for input
		int num1, num2 = 0;
		Scanner mathSC = new Scanner(System.in);

		// Getting the inputs entered by the user for num1 and num2
		System.out.print("Please enter Number 1:");
		num1 = mathSC.nextInt();
		System.out.print("Please enter Number 2:");
		num2 = mathSC.nextInt();

		// Closing scanner
		mathSC.close();

		// Where the GCD method is called for the users inputs
		int greCoDi = gcd(num1, num2);

		// Displaying the gcd of two numbers
		System.out.println(greCoDi + " is the GCD of " + num1 + " and " + num2);

	}

	// Recursion calculation method
	public static int gcd(int num1, int num2) {

		if (num2 <= num1) {

			if (num1 % num2 == 0) {

				return num2;

			}
		}

		else if (num1 < num2) {

			return gcd(num2, num1);
		}

		return gcd(num2, num1 % num2);

	}
}
