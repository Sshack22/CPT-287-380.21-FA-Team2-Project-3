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
		
		//TODO: Create loop for user input
		
		//TODO: Read user input and determine if decode or encode
		
		//TODO: Remove debug code
		//BinaryTreeAlgorithms.preorderTraverse(root);
		
		inputFile.close(); // Close file
		scanner.close(); // Close scanner
	}
}
