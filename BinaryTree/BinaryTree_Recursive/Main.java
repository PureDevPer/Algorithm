package BinaryTree_Recursive;

public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		// create root
		tree.root = new Node(1);
		/* following is the tree after above statement 
		  
	        1 
	      /   \ 
	    null  null     
	    
	    */
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		/* 2 and 3 become left and right children of 1 
		        1 
		      /   \ 
		     2      3 
		   /    \    /  \ 
		 null null null null  
		 
		 */
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		/* 4 becomes left child of 2 
		        1 
		    /       \ 
		   2          3 
		 /   \       /  \ 
		4     5  null  null 
		/   \ 
		null null
		 
		*/
		System.out.println("Inorder: "); tree.Inorder(tree.root);
		System.out.println("\nPreOrder: "); tree.Preorder(tree.root);
		System.out.println("\nPostOrder: "); tree.Postorder(tree.root);
		
		// Insertion
		Node root1 = null;
		root1 = tree.insert(root1, 4);
		tree.insert(root1, 2);
		tree.insert(root1, 1);
		tree.insert(root1, 3);
		tree.insert(root1, 6);
		tree.insert(root1, 5);
		
		System.out.println("\n\nInorder: "); tree.Inorder(root1);
		System.out.println("\n\nMin value of BST is " + tree.minValue(root1));
		System.out.println("Min value of BST is " + tree.maxValue(root1));
		
		// Delete
		tree.delete(root1);
		System.out.println();
		tree.deleteAll(root1);
		
	}
}
