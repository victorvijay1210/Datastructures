package BinarySearchTree;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree myBST = new BinarySearchTree();
		 myBST.insert(47);
	        myBST.insert(21);
	        myBST.insert(76);
	        myBST.insert(18);
	        myBST.insert(27);
	        myBST.insert(52);
	        myBST.insert(82);
		 
		System.out.println("Root =" + myBST.root);
	      System.out.println("Root: " + myBST.root.value);
	        System.out.println("\nRoot->Left: " + myBST.root.left.value);
	        System.out.println("\nRoot->Right: " + myBST.root.right.value);
	        
	        System.out.println("BST Contains 27:");
	        System.out.println(myBST.contains(27));

	        System.out.println("\nBST Contains 17:");
	        System.out.println(myBST.contains(17));


	}

}
