package BinarySearchTree;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree myBST = new BinarySearchTree();
		 myBST.insert(2);
	        myBST.insert(1);
	        myBST.insert(3);
		
		System.out.println("Root =" + myBST.root);
	      System.out.println("Root: " + myBST.root.value);
	        System.out.println("\nRoot->Left: " + myBST.root.left.value);
	        System.out.println("\nRoot->Right: " + myBST.root.right.value);

	}

}
