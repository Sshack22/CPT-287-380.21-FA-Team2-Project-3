package project_3;

public class Methods {


	public static void builder(String token, TreeNode root) {
		
		char letter = token.charAt(0);
		
		int tokenLength = token.length() - 1;
		
		for (int i = 1; i < token.length(); i++) {
			
			char c = token.charAt(i);

			if (c == '.') {
				if (root.left == null) {
					TreeNode newLeft = new TreeNode(' ');
					root.left = newLeft;
					if (i == tokenLength) {
						newLeft.val = letter;
					} else { root = newLeft; }
				} else {
					if (i == tokenLength) {
						root.left.val = letter;
					} root = root.left; 
				}
				
			}
			
			if (c == '-') {
				if (root.right == null) {
					TreeNode newRight = new TreeNode(' ');
					root.right = newRight;
					if (i == tokenLength) {
						newRight.val = letter;
					} else { root = newRight; }
				} else {
					if (i == tokenLength) {
						root.right.val = letter;
					} root = root.right; 
				}
				
			}

		}
		
	}

}
