package project_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		 
		FileInputStream inputFile = new FileInputStream("Morse_Code.txt");
		Scanner scanner = new Scanner(inputFile);	// Input file scanner
		
		//Create Tree
		TreeNode root = new TreeNode(' '); // Create node for root of morse code tree
		
		while (scanner.hasNext()) { // Loop through all lines of text file
			String token = scanner.nextLine(); // Store line of text
			Methods.builder(token, root); // Create node for current line
		} // End while
		
		inputFile.close(); // Close file
		scanner.close(); // Close scanner
		
		// Create input scanner for console
		Scanner inputScanner = new Scanner(System.in);
		
		String userPrompt = "Please enter text to encode/decode:"; 
		// Initialize string variable to store console inputs
		String input = " ";
		System.out.println(userPrompt); // Prompt user
		// Create loop for user input
		while(inputScanner.hasNext()) {			
			input = inputScanner.nextLine(); // Store console input
			if(input.charAt(0) == '.' || input.charAt(0) == '-') { // If input starts with a dot or dash
				System.out.println(Methods.decode(input,root));	 // Pass input into decode method
			} else {
				System.out.println(Methods.encode(input,root)); // Pass input into encode method
			}
			System.out.println();
			System.out.println(userPrompt); // Prompt user
		}
		
		inputScanner.close(); // Close scanner
	}
}
