//Creating a Node class
	public class Node<Integer> {
		// Initialization of variables
		private Integer element;
		private Node<Integer> left;
		private Node<Integer> right;
		
		public Integer getElement() {
			return element;
		}
		
		public void setElement(Integer element) {
			this.element = element;
		}
		
		public Node<Integer> getLeft() {
			return left;
		}
		
		public void setLeft(Node<Integer> left) {
			this.left = left;
		}
		
		public Node<Integer> getRight() {
			return right;
		}
		
		public void setRight(Node<Integer> right) {
			this.right = right;
		}

		public Node(Integer element) {
			super();
			this.element = element;
			this.left = null;
			this.right = null;
		}
		
		
		
}
