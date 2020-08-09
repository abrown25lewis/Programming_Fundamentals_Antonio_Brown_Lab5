import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class readMePlease {
	
	
		// Setting a throw exception, if file is not found it will display 
		//throw message and terminate program
		public static void main(String[] args) throws IOException
		{
			
			// Initializing my variables 
			int lineMax,counter, count = 0;
			String myLine, cleanLine;
			
			// Setting up an empty string array to format the read strings from file
			String[] myArray = null;
			
			// Creating a path to the file that my program will read and allowing it to be read and scanned
			String myInput = "C:\\\\Users\\\\abrown\\\\Desktop\\\\GitHub\\\\Programming_Fundamentals_Antonio_Brown_ex\\\\src\\\\input.csv";
			File inputCsv = new File(myInput);
			Scanner myScan = new Scanner(inputCsv);

			System.out.println("Maximum values");

			// Creates loop to read the whole file
			while (myScan.hasNext())
			{
				
				// Reading each line within input.csv file and converting formatting to be read as an integer
				myLine = myScan.nextLine();
				cleanLine = myLine.replaceAll("\"", "");
				myArray = cleanLine.trim().split(",");
				lineMax = 0;
				
				// loop for each sting line
				for (int x = 0; x < myArray.length; x++)

				{
					counter = Integer.parseInt(myArray[x]);

					// looping until max value is identified
					if (counter > lineMax)

						lineMax = counter;

				}
				
				count++;
				System.out.println("ROW " + count + " : " + lineMax);

			}

			// Closing Scan
			myScan.close();

		}

	}


