import java.util.Stack;

public class LinkedList {
	
	public class Node {
		int element;
		Node next;

		public Node(int data) {
			element = data;
			next = null;
		}

		public int getElement() {
			return element;
		}
		
	}

	private Node head;
	private int length = 0;
	private int position;

	public LinkedList() {
		this.head = null;
	}
	
	public Node getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}

	public int getPosition() {
		return position;
	}

	public void insert(int element) {
		Node newNode = new Node(element);
		Node temp = head;

		if (head == null) {
			head = newNode;
		}

		else {
			while (temp.next != null) 
				temp = temp.next;
			
			temp.next = newNode;
		}
		
		this.length++;
	}
	
	public void insert(int element, int position) {
		Node newNode = new Node(element);
		Node temp = head;
		
		if(position == 0) {
			newNode.next = temp;
			head = newNode;
			
		}
		else {
			for(int i = 0; i<position-1; i++) {
				temp = temp.next;
			}
			Node prevNode = temp;
			newNode.next = prevNode.next;
			temp.next = newNode;
		}
	}

	public int length() {
		return this.length;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.element + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void displayReccur(Node l) {;
		if(l != null) {
			System.out.print(l.getElement() + " ");
			displayReccur(l.next);
		}
	}
	
	public void displayRev() {
		Node temp = head;
		
		Stack<Integer> stack = new Stack<>();
		while(temp!=null) {
			stack.push(temp.getElement());
			temp = temp.next;
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}
	
	public int find(int element) {
		Node temp = head;
		int counter = 0;
		
		while (temp != null) {
			if (temp.getElement() == element)
				return counter;
			temp = temp.next;
			counter++;
			}
		return -1;
	}
	
	public int get(int position) {
		Node temp = head;
		if (position == 0) {
			return head.getElement();
		}
		else {
			for(int i=0; i<position; i++) {
				temp = temp.next;
			}
				return temp.getElement();
		}
	}
}
