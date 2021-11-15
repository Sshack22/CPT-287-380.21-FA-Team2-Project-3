package project_3;

public class Methods {

	/**
	 * Builds a binary tree containing letters of the alphabet.
	 * @param token: line of text
	 * @param root: root of new tree
	 */
	public static void builder(String token, TreeNode root) {
		
		char letter = token.charAt(0); // Get letter from string
		int tokenLength = token.length(); // Store length of text line
		
		// Loop through all characters in the string, except first character
		for (int i = 1; i < tokenLength; i++) {
			
			char c = token.charAt(i); // Store current character
			
			// If character is a dot
			if (c == '.') {
				// If left node is null
				if (root.left == null) { 
					TreeNode newLeft = new TreeNode(' '); // Create empty node
					root.left = newLeft; // Assign new node to root's left
					// If current character is the final one
					if (i == tokenLength) { newLeft.val = letter; } // Assign the letter to the node
					else { root = newLeft; } // Else, move down tree to the left
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
					if (i == tokenLength) { newRight.val = letter; } // Assign the letter to the node
					else { root = newRight; } // Else, move down tree to the right
				// Else, right node is not null
				} else {
					// If current character is the final one
					if (i == tokenLength) { root.right.val = letter; } // Assign the letter to the node
					root = root.right; // Move down tree to the right
				}
			} // End Else-If
		} // End For Loop
	} // End builder method
	
	
	public String encode(String input) {
		//TODO FINISH METHOD	
	}
	
	public String decode(String input) {
		//TODO FINISH METHOD
	}
}
