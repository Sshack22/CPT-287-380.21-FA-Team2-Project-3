package project_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {


	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream inputFile = new FileInputStream("Morse_Code.txt");
		
		Scanner scanner = new Scanner(inputFile);	// Input file scanner

		TreeNode root = new TreeNode(' ');

		while (scanner.hasNext()) {

			String token = scanner.nextLine();
			
			Methods.builder(token, root);

		}
		
		System.out.print(root.right.left.val);
		scanner.close();
	}
}