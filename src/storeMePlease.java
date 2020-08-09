import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class storeMePlease {

	public static void main (String[] args) throws IOException
	{
	
	// Initializing string variables and creating output file name
	// and creating scanner for user input	
	String input;
	String userFile = "userStrings.txt";
	Scanner userIn =new Scanner(System.in);
	
	// Opens file and allows writing of text file
	FileWriter uStringF = new FileWriter (userFile);
	
	// Creates buffer to store data so there is no waiting for each 
	// character to be written to disk
	BufferedWriter buffString = new BufferedWriter (uStringF);
	
	// Prints out information to file
	PrintWriter userOutFile = new PrintWriter (buffString);
	
	
	System.out.print("Please enter your string and type " + "(DONE)" + " when strings are completed: "); 
	
	// Creates loop to run while there continues to be user input
	   while(true) 
	   {
		   
	   input = userIn.nextLine();
	   
	   // Reading each line to see if DONE has been entered
	   if(input.equals("DONE")) 
	   
	   // If "DONE" is entered then the file is terminated	
	   break; 
	   
	   }
	 
	   // This allows for the input to be written to the file but not the sentinel string.  
	   userOutFile.print (input + " "); 
	   userOutFile.println ();

	   //Closing output and input streams   
	   userOutFile.close();
	   userIn.close();
		
	   
	   System.out.println ("Your output file is now stored in " + userFile);
	
	
	
	}
	

}
