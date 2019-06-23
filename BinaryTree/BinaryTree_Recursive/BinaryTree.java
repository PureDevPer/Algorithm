package BinaryTree_Recursive;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(int key) {
		root = new Node(key);
	}

	// Preorder traversal
	// root, left, right
	void Preorder(Node node) {
		if (node == null)
			return;

		System.out.print(node.key + " ");
		Preorder(node.left);
		Preorder(node.right);
	}

	// Inorder traversal
	// left, root, right
	void Inorder(Node node) {
		if (node == null)
			return;

		Inorder(node.left);
		System.out.print(node.key + " ");
		Inorder(node.right);
	}

	// Postorder traversal
	// left, right, root
	void Postorder(Node node) {
		if (node == null)
			return;

		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.key + " ");
	}

	Node insert(Node node, int data) {
		// If the tree is empty, return a new single node
		if (node == null) {
			return (new Node(data));
		} else {
			// Otherwise, recur down the tree
			if (data <= node.key)
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		}

		// return the (unchanged) node pointer
		return node;
	}

	void delete(Node node) {
		// In Java, automatic garbage collection happens.
		// So, we can simply make root null to delete the tree
		BinaryTree bt = new BinaryTree();
		bt.root = null;
		System.out.println("Deleting Node: " + node.key);
		node = null;
	}

	// It traverses tree in post order to delete each and every node of the tree
	void deleteAll(Node node) {
		if (node == null)
			return;

		// First, delete both subtrees
		deleteAll(node.left);
		deleteAll(node.right);

		System.out.println("Deleting node: " + node.key);
	}

	// Return minimum data value
	int minValue(Node node) {
		Node current = node;

		// Loop down to find the leftmost leaf
		while (current.left != null) {
			current = current.left;
		}

		return (current.key);
	}

	int maxValue(Node node) {
		Node current = node;

		while (current.right != null)
			current = current.right;

		return current.key;
	}

}
