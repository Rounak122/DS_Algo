package DS;

import java.util.*;

public class TreeVerticalTraversal {
	
	static TreeMap<Integer, List<Integer>> map;
	static Queue<Node> queue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(8);
		root.left = new Node(4);
		root.left.left = new Node(7);
		root.left.left.right = new Node(14);
		root.left.left.right.right = new Node(20);
		root.right = new Node(1);
		root.right.left = new Node(2);
		root.right.right = new Node(3);
		
		map = new TreeMap<>();
		queue = new LinkedList<Node>();
		
		verticalOrder(root,0);
//		verticalLevelOrder(root,0);
		
		for (Collection<Integer> collection: map.values()) {
			System.out.println(collection);
		}
	}
	
	static void verticalOrder(Node node, int i) {
		
		if (node==null)
			return;
		
		if(!map.containsKey(i))
			map.put(i,new ArrayList<Integer>());
		
		map.get(i).add(node.data);
		
		verticalOrder(node.left, i-1);
		verticalOrder(node.right, i+1);
		
	}
	
//	static void verticalLevelOrder(Node node, int i) {
//		
//		if (node==null)
//			return;
//		
//		queue.add(node);
//		
//		while(!queue.isEmpty()) {
//			
//			Node temp = queue.remove();
//			
//			//TODO do something with the node
//			
//			if (!map.containsKey(i))
//				map.put(i, new ArrayList<Integer>());
//			map.get(i).add(temp.data);
//			
//			verticalLevelOrder(node.left,i-1);
//			verticalLevelOrder(node.right,i+1);
//			
//			
//		}
		
		
//	}

}

// NODE IS ALREADY DEFINED IN THIS PACKAGE in tree.java
//
//class Node{
//	
//	Node left;
//	Node right;
//	int data;
//	
//	public Node(int data) {
//		
//		this.data = data;
//		
//	}
	
//}
