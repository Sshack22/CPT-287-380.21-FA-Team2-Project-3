package project_3;

public class TreeNode {
	
	//Data fields
	public char val;
	public TreeNode left, right;
	
	//Constructors
	public TreeNode(char x) { val = x; }
	
	public TreeNode(char x, TreeNode leftChild, TreeNode rightChild) {
		val = x;
		left = leftChild;
		right = rightChild;
	}

}
