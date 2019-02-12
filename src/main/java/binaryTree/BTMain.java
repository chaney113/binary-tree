package binaryTree;

public class BTMain {
	public static void main(String[] args) {
		System.out.println("Hello World from binaryTree main!");
		
		BinaryTree bt = new BinaryTree();
		
		bt.add(27);
		bt.add(14);
		bt.add(10);
		bt.add(19);
		bt.add(31);
		bt.add(35);
		bt.add(42);
		bt.add(27);
		System.out.println("Size: " + bt.getSize());
		
		System.out.println("traverseLevelOrder");
		bt.traverseLevelOrder();
		System.out.println();
		
		System.out.println("traversePreOrder");
		bt.traversePreOrder(bt.root);
		System.out.println();
		
		System.out.println("traverseInOrder");
		bt.traverseInOrder(bt.root);
		System.out.println();
		
		System.out.println("traversePostOrder");
		bt.traversePostOrder(bt.root);
		System.out.println();
	}

}
