public class TesterBinarySearchTree {
	public static void main(String[] args) {
		
		BinarySeacrhTree<Integer> b = new BinarySeacrhTree<>();
		
		b.insert(50);
		b.insert(60);
		b.insert(40);
		b.insert(20);
		b.insert(30);
		b.insert(90);
		b.insert(100);
		b.insert(10);
		b.insert(70);
		b.insert(80);
		
		b.printPreOrderRecur(b.getRoot());
		System.out.println();
		
		b.printInOrderRecur(b.getRoot());
		System.out.println();
		
		b.printPostOrderRecur(b.getRoot());
		System.out.println();
		
		b.find(1001);
		
	}
}
