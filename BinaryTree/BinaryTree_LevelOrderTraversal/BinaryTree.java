package BinaryTree_LevelOrderTraversal;

public class BinaryTree {

	// Root of the Binary Tree
	Node root;

	public BinaryTree() {
		root = null;
	}

	public void printLevelOrder() {
		int h = height(root);
		for (int i = 1; i <= h; ++i)
			printGivenLevel(root, i);
	}

	public int height(Node root) {
		if (root == null)
			return 0;
		else {
			// compute height of each subtree
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);

			// Use the larger one
			if (leftHeight > rightHeight)
				return (leftHeight + 1);
			else
				return (rightHeight + 1);
		}
	}

	public void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}
}
