//Creating a Node class
	public class Node {
		// Initialization of variables
		private int element;
		private Node next;

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setElement(int element) {
			this.element = element;
		}

		public int getElement() {
			return element;
		}
		
		public Node(int data) {
			element = data;
			next = null;
		}
	}
