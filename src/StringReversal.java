import java.util.Scanner;

public class StringReversal {

	// This will be the driver to test reverse implementation
		public static void main(String[] args) {

			// Creating scanner for user input
			Scanner userIn = new Scanner(System.in);

			// Prompts user to enter string
			System.out.print("Please enter your string: ");

			// reads entered string and stores in variable s
			String s = userIn.nextLine();

			// Calls method reverseString to take s and reverse it
			String revString = reverseString(s);

			// prints reversed string
			System.out.println("The original string in reverse is!! " + revString);

			// Closes scanner
			userIn.close();

		}

		// The recursive method to take the s string and reverse it

		public static String reverseString(String s)

		{

			// If the string has no characters or the length of the string is 1 or less
			// then the program will just return the original string
			if (s == null || (s.length() <= 1)) {

				return s;

			}

			/*
			 * s.charAt(0) takes the first character of the string and places it at the end
			 * and keeps the remaining characters of a string in a sub string that it will
			 * continue this processes on until their are no remaining characters
			 */

			return reverseString(s.substring(1)) + s.charAt(0);

		}

}
