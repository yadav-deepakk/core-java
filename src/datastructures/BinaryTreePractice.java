package datastructures;

public class BinaryTreePractice{
	static class TreeNode{
		int data;
		TreeNode leftNode, rightNode;
		
		TreeNode(int data){
			this.data = data;
			this.leftNode = null;
			this.rightNode = null;
		}
	}
	
	static class BinarySearchTree{
		private TreeNode root;
		
		BinarySearchTree(){
			this.root = null;
		}
		
		BinarySearchTree(int[] nodes){
			TreeNode newNode = new TreeNode(nodes[0]);
			this.root = newNode;
			
			for(int i=1; i<nodes.length; i++) {
				this.insertNode(nodes[i]);
			}
		}
		
		public void insertNode(int data) {
			TreeNode newNode = new TreeNode(data);
			
			TreeNode parent = null;
			TreeNode current = this.root;
			while(current!=null) {
				parent = current;
				if(data < current.data) {
					current = current.leftNode;
				}else {
					current = current.rightNode;
				}
			}
			
			if(data>parent.data) {
				parent.rightNode = newNode;
			}else {
				parent.leftNode = newNode;
			}
		}
		
		// data passed in to delete should be present in tree.
		public void deleteNode(int nodeData) {			
			TreeNode parent = null;
			TreeNode current = this.root;
			while(current!=null || current.data!=nodeData) {
				parent = current;
				if(nodeData<current.data) {
					current = current.leftNode;
				}else {
					current = current.rightNode;
				}
			}
			
			// node has no child 
			if(current.leftNode==null && current.rightNode==null) {
				current = null;
			}
			
			// node has one child: either left/right.
			else if(current.leftNode==null || current.rightNode==null) {
				current = (current.leftNode==null) ? current.rightNode:current.leftNode;
			}
			
			// node has 2 child.
			else {
				
			}
		}
		
		public void inOrderTraverse(TreeNode parent){
			if(parent == null) {
				return;
			}
			
			this.inOrderTraverse(parent.leftNode);
			System.out.print(parent.data + " ");
			this.inOrderTraverse(parent.rightNode);
		}
		
		public void preOrderTraverse(TreeNode parent){
			if(parent == null) {
				return;
			}
			
			System.out.print(parent.data + " ");
			this.inOrderTraverse(parent.leftNode);
			this.inOrderTraverse(parent.rightNode);
		}
		
		public void postOrderTraverse(TreeNode parent){
			if(parent == null) {
				return;
			}
			
			this.inOrderTraverse(parent.leftNode);
			this.inOrderTraverse(parent.rightNode);
			System.out.print(parent.data + " ");

		}
		
	}
	
	
	public static void main(String... args) {
		int[] arr = {3,7,1,34,8,71};
		BinarySearchTree bst = new BinarySearchTree(arr);
		
		System.out.print("InOrderTraversal: ");
		bst.inOrderTraverse(bst.root);
		System.out.println();
		bst.preOrderTraverse(bst.root);
		System.out.println();
		bst.postOrderTraverse(bst.root);
		System.out.println();
		
	}
}