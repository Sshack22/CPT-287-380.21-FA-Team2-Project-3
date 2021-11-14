package project_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {


	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream inputFile = new FileInputStream("Morse_Code.txt");
		
		Scanner scanner = new Scanner(inputFile);	// Input file scanner
		Scanner userScanner = new Scanner(System.in);

		TreeNode root = new TreeNode(' ');

		while (scanner.hasNext()) {

			String token = scanner.nextLine();
			
			Methods.builder(token, root);

		}
//		System.out.println("enter characters to encode: ");
//		String decode = userScanner.nextLine();
//		
//		System.out.print(Methods.decode(decode, root));
//		
		
		
		
		System.out.print(root.left.left.right.val);
		scanner.close();
	}
}