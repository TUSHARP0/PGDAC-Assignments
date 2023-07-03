//Creating a Node class
	public class Node<T> {
		// Initialization of variables
		private T element;
		private Node<T> prev;
		private Node<T> next;
		
		public T getElement() {
			return element;
		}
		
		public void setElement(T element) {
			this.element = element;
		}
		
		public Node<T> getPrev() {
			return prev;
		}
		
		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}
		
		public Node<T> getNext() {
			return next;
		}
		
		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node(T element) {
			super();
			this.element = element;
			this.prev = null;
			this.next = null;
		}
		
		
		
}
