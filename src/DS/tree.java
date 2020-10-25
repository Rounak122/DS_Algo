package DS;

import java.util.*;

public class tree {
	
	static Scanner sc = null;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
//		Node root = createTree();
		
		Node root = new Node(2);
		root.left = new Node(4);
		root.left.left = new Node(7);
		root.right = new Node(1);
		root.right.left = new Node(8);
		root.right.right = new Node(3);
		
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);

	}
	
	
	static Node createTree() {
		
		Node temp = null;
		System.out.println("Enter Data");
		int data = sc.nextInt();
		
		if (data == -1)
			return null;
		
		temp = new Node(data);
		
		System.out.println("Enter Left Node for " + data);
		temp.left = createTree();

		System.out.println("Enter Right Node for " + data);
		temp.right = createTree();
		
		return temp;
	}

	
	static void inOrder(Node node) {
		
		if (node == null)
			return;
		
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
		
	}
	
	static void preOrder(Node node) {
		
		if (node == null)
			return;
		
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	static void postOrder(Node node) {
		
		if (node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
		
	}
	
}



class Node{
	
	Node left;
	Node right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
