package javaTest.tree;

class NodeTree{
	int data;
	NodeTree left,right;
	
	NodeTree(int data){
		this.data=data;
		this.left=this.right=null;
	}
}

public class TreePrint {
	
	NodeTree node;
	public static void main(String args[]) {
		TreePrint tree= new TreePrint();
		tree.insertTree(10);
		tree.insertTree(20);
		tree.insertTree(4);
		tree.insertTree(8);
		tree.insertTree(50);
		tree.inorder();
	}
	
	public void insertTree(int data) {
		
		NodeTree temp= new NodeTree(data);
		
		if(node==null) {
			node=temp;
			return;
		}
		NodeTree temp2= node;
		while(temp2!=null && temp2.left!=null && temp2.right!=null) {
			if(temp2.data>temp.data) {
				temp2=temp2.left;
			}else {
				temp2=temp2.right;
			}
		}
		if(temp2.data>temp.data) {
			temp2.left=temp;
		}else {
			temp2.right=temp;
		}
	}
	
	public void inorder() {
		while(node!=null) {
			System.out.println(node.data);
		}
	}
}
