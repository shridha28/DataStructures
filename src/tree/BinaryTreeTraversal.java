package tree;

import java.util.ArrayList;

public class BinaryTreeTraversal {
	
	static TreeNode root;
	
	public static void main(String args[]) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(78);
		list.add(78585);
		list.add(377);
		list.add(2, 8383);
		root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.right.left =new  TreeNode(7);
		root.right.right = new TreeNode(8);
		root.left.right = new TreeNode(10);
		root.left.left = new TreeNode(11);
		root.left.left.right = new TreeNode(11);
		/*
		 *                      1
		 *                  3       6
		 *              11    10  7    8
		 */
		
		inOrderTraversal(root);
		System.out.println("********************************");
		preOrderTraversal(root);
		System.out.println("********************************");
		postOrderTraversal(root);
		System.out.println("********************************");
		
		System.out.println("Height:"+findHeight(root));
		
		
		
		
	}
	
	static int findHeight(TreeNode node) {
		if(node==null)
			return 0;
		else {
			
			int lDepth = findHeight(node.left);
			int rDepth = findHeight(node.right);
			if(lDepth>rDepth)
				return lDepth+1;
			else
				return rDepth+1;
			
			
			
		}
		
	}
	
	static void inOrderTraversal(TreeNode node) {
		
		if(node==null)
			return;
		inOrderTraversal(node.left);
		System.out.print(node.data+" ");
		inOrderTraversal(node.right);
		
	}
	
	static void preOrderTraversal(TreeNode node) {
		
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
		
	}
	
	static void postOrderTraversal(TreeNode node) {
		
		if(node==null)
			return;
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data+" ");
	}
	
	
}


class TreeNode{
	
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data=data;
		left= null;
		right=null;
	}
	
}
