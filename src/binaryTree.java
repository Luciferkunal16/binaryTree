package binaryTree;

public class binaryTree {

	binaryTreeNode root;

	binaryTreeNode addRecursive(binaryTreeNode current, int value) {
		if (current == null) {
			return new binaryTreeNode(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}
	/* Adding node with help of recurssion from the root Node
	 */
	 
	
	
	public void add(int value) {
	    root = addRecursive(root, value);
	}
}