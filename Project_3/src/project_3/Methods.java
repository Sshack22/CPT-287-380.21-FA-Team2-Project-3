package project_3;

import java.util.Stack;

public class Methods {

	/**
	 * Builds a binary tree containing letters of the alphabet.
	 * @param token: line of text
	 * @param root: root of new tree
	 */
	public static void builder(String token, TreeNode root) {
		
		char letter = token.charAt(0); // Get letter from string
		int tokenLength = token.length() - 1; // Store length of text line
		
		// Loop through all characters in the string, except first character
		for (int i = 1; i < token.length(); i++) {
			
			char c = token.charAt(i); // Store current character
			
			// If character is a dot
			if (c == '.') {
				// If left node is null
				if (root.left == null) { 
					TreeNode newLeft = new TreeNode(' '); // Create empty node
					root.left = newLeft; // Assign new node to root's left
					// If current character is the final one
					if (i == tokenLength) { newLeft.val = letter; // Assign the letter to the node
					} else { root = newLeft; } // Else, move down tree to the left
				// Else, left node is not null
				} else {
					// If current character is the final one
					if (i == tokenLength) { root.left.val = letter; } // Assign the letter to the node
					root = root.left; // Move down tree to the left 
				}
			} // Else, if character is a dash
			else if (c == '-') {
				// If right node is null
				if (root.right == null) {
					TreeNode newRight = new TreeNode(' '); // Create empty node
					root.right = newRight; // Assign new node to root's right
					// If current character is the final one
					if (i == tokenLength) { newRight.val = letter; // Assign the letter to the node
					} else { root = newRight; } // Else, move down tree to the right
				// Else, right node is not null
				} else {
					// If current character is the final one
					if (i == tokenLength) { root.right.val = letter; } // Assign the letter to the node
					root = root.right; // Move down tree to the right
				}
			} // End Else-If
		} // End For Loop
	} // End builder method	
	
	/**
	 * Encodes input text to morse code.
	 * @param input: string to be encoded to morse code
	 * @param root: root of morse code tree
	 * @return: string containing dots and dashes ('.' and '-') representing input characters
	 */
	public static String encode(String input, TreeNode root) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			if(letter == ' ') { continue; }
			//TODO REMOVE DEBUG CODE
//			System.out.println(letter);
			Stack<Character> path = new Stack<>();
			encodeSearch(letter, root, path);
			while(!path.isEmpty()) { output += path.pop();}
			output += " ";
		}
		return output;
	}
	
	/**
	 * Determines a path to the target letter in the morse code tree and adds dots and dashes to a stack.
	 * @param letter: target letter
	 * @param root: root of the morse code tree
	 * @param path: a stack containing dots and dashes representing the path to a target letter.
	 * @return: true if a character is located, false otherwise
	 */
	private static boolean encodeSearch(char letter, TreeNode root, Stack<Character> path) {
		if(root == null){return false;} // Base Case 1: Node is null
		if(root.val == letter) {return true;} // Base Case 2: Node contains letter
		if(encodeSearch(letter, root.left, path)) { path.add('.'); return true;	} // Add dot to stack for every left path
		else if(encodeSearch(letter, root.right, path)) { path.add('-'); return true; } // Add dash to stack for every right path
		else {return false;}
	}

	public static String decode(String input, TreeNode root) {

		String result = "";
		TreeNode current = root;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == ' ') { // If a space, then append the node value to result.
				result += current.val;
				i++;
				current = root; // Return current to roots position.
			}

			if (input.charAt(i) == '.') { // If char is a '.', traverse left.
				current = current.left;
			}

			else {
				current = current.right; // If char is a '-', traverse right.
			}

			if (i == input.length() - 1) { // When we reach the end of the input, append the current node to result.
				result += current.val;
			}
		}

		return result;
	}
}
