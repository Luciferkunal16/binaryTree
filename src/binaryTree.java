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
	/*
	 * Adding node with help of recurssion from the root Node
	 */

	public void add(int value) {
		root = addRecursive(root, value);
	}

	int getSizeRecursive(binaryTreeNode current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);

	}

	int getSize() {
		return this.getSizeRecursive(root);

	}
// 
	private boolean searchRecursively(binaryTreeNode current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		return value < current.value ? searchRecursively(current.left, value)
				: searchRecursively(current.right, value);
	}

	public boolean search(int value) {
		return searchRecursively(root, value);
	}
}