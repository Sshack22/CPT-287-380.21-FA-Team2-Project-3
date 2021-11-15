package project_3;

public class BinaryTreeAlgorithms {
	/**
	 * Finds the height of a binary tree.
	 * @param root: root node of the binary tree.
	 * @return: height of the binary tree.
	 */
	public static int height(TreeNode root) {
		if(root == null) {return 0;}
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	/**
	 * Preorder traverses a binary tree.
	 * @param root: root node of the binary tree.
	 */
	public static void preorderTraverse(TreeNode root) {
		if(root != null) {
			System.out.print(String.valueOf(root.val)+','); // visit the root
			preorderTraverse(root.left);
			preorderTraverse(root.right);
		}
	}
	
	/**
	 * Inorder traverses a binary tree.
	 * @param root: root node of the binary tree.
	 */
	public static void inorderTraverse(TreeNode root) {
		if(root != null) {
			inorderTraverse(root.left);
			System.out.print(String.valueOf(root.val) + ','); // visit the root
			inorderTraverse(root.right);
		}
	}
	
	/**
	 * Postorder traverses a binary tree.
	 * @param root: root node of the binary tree.
	 */
	public static void postorderTraverse(TreeNode root) {
		if(root != null) {
			postorderTraverse(root.left);
			postorderTraverse(root.right);
			System.out.print(String.valueOf(root.val) + ' '); // visit the root
		}
	}
	
	public static boolean isFull(TreeNode root) {
		// base case
		if(root == null) {return true;} // node is empty
		if(root.left != null && root.right == null) {return false;} // left node is not empty, but right node is empty
		if(root.left == null && root.right != null) {return false;} // left node is empty, but right node is not empty
		// recurrence relation
		return isFull(root.left) && isFull(root.right);
	}
	
	//TODO: HOMEWORK SOLUTION!
	/**
	 * Finds the number of nodes in the tree.
	 * @param root: root node of the binary tree.
	 * @return: number of nodes in the binary tree.
	 */
	public static int numNodes(TreeNode root) {
		if(root == null) {return 0;}
		return 1 + numNodes(root.left) + numNodes(root.right);
	}
}
