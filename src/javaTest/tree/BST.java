package javaTest.tree;
class Node{
	int data;
	Node left,right;
	
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

public class BST {
	
	
	public static void main(String args[]) {
		Node root=null;
		BST bst= new BST();
	root=	bst.insert(10,root);
		bst.insert(45,root);
		bst.insert(2,root);
		
		bst.inorder(root);
		
	}
	
	public Node insert(int data,Node root) {
		//Node newNode= new Node(data);
		if(root==null) {
			
			return new Node(data);
		}
		if(data <root.data) {
			root.left=insert(data,root.left);
		}
		else if(data > root.data){
			root.right=insert(data,root.right);
		}
		return root;
	}
	
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	
}
