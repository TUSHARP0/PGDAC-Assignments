@SuppressWarnings("hiding")
public class BinarySeacrhTree <Integer> {
	private Node<Integer> root;

	public Node<Integer> getRoot() {
		return root;
	}

	public void setRoot(Node<Integer> root) {
		this.root = root;
	}

	public BinarySeacrhTree() {
		
	}
	
	public boolean insert(Integer element){
		Node<Integer> newNode = new Node<>(element);
		
		if (root == null) {
			root = newNode;
			return true;
		}
		
		Node<Integer> temp = root;
		
		while(temp != null) {
			
			if(temp.getElement().equals(temp)) {
				return false;
			}

			if((int)temp.getElement() > (int)element) {
				if(temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			}
		
			if((int)temp.getElement() < (int)element) {
				if(temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
		
		return false;
		
	}
	
	public void printInOrderRecur(Node<Integer> node) {
		// Left-Parent-Right
		
		if(node == null)
			return ;
		
		printInOrderRecur(node.getLeft());
		
		System.out.print(node.getElement() + " ");
		
		printInOrderRecur(node.getRight());
		
		
	}
	
	public void printPreOrderRecur(Node<Integer> node) {
		// Parent-Left-Right
		
		if(node == null)
			return ;
				
		System.out.print(node.getElement() + " ");
		
		printPreOrderRecur(node.getLeft());
		
		printPreOrderRecur(node.getRight());
	}
	
	public void printPostOrderRecur(Node<Integer> node) {
		// Left-Right-Parent
		
		if(node == null)
			return ;
		
		printPostOrderRecur(node.getLeft());
		
		printPostOrderRecur(node.getRight());
				
		System.out.print(node.getElement() + " ");
	}
	
	public boolean find(Integer element) {
		Node<Integer> temp = root;
		
		while(temp.getElement() != element) {
			if((int)temp.getElement()> (int)element) {
				temp = temp.getLeft();
			}
			else {
				temp = temp.getRight();
			}
		}
		System.out.println("Element Found");
		return true;
		
	}
	
	public void findRecur(int element , Node node) {
		if((int)node.getElement() == element) {
			System.out.println("Element found");
			return ;
		}
		
		else {
			if((int)node.getElement() < element) {
				findRecur()
			}
		}
	}
	
}
