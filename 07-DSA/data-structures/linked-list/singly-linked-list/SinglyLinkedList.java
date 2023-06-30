import java.util.Stack;

public class SinglyLinkedList<T> {

	// Initialization of required variables
	private Node<T> head;
	private int length = 0;
	private int index;

	// Default Constructor
	public SinglyLinkedList() {
		this.head = null;
	}
	
	// Getter method for Head
	public Node<T> getHead() {
		return head;
	}

	// Getter method for Length of LinkedList
	public int getLength() {
		return length;
	}

	// Getter method for Position of an Element in the LinkedList
	public int getIndex() {
		return index;
	}

	// Insert method: taking an Integer element as an argument
	public void insert(T element) {
		
		// Wrapping the Element into a Node class Constructor
		Node<T> newNode = new Node<>(element);
		// Saving the head value into a temp Variable
		Node<T> temp = head;

		// Checking if head is null i.e. the LinkedList is empty
		if (head == null) {
			// Then add the Node class wrapped element at the place of head
			head = newNode;
		}

		// if head is not null: i.e. the LinkedList is not empty
		else {
			// Using while loop to iterate to the last Element in the LinkedList
			while (temp.getNext() != null) 
				// Setting temp.next into temp to iterate through the LinkedList
				temp = temp.getNext();
			
			// Setting the temp.next value as the newNode i.e. Element wrapped in Node class Constructor
			temp.setNext(newNode);
		}
		
		// Incrementing the value of length variable to keep the count of Elements in the LinkedList
		this.length++;
	}
	
	// Insert method: taking an Integer element and position at which the Element is to be added as arguments
	public void insert(T element, int index) {
		
		// Wrapping the Element into a Node class Constructor 
		Node<T> newNode = new Node<>(element);
		// Saving the head value into a temp Variable
		Node<T> temp = head;
		
		// Position == 0: save the set the head value as the newNode and 
		if(index == 0) {
			// Saving the values of temp into the next of the new Node class wrapped Element
			newNode.setNext(temp);
			// Replacing the head wit the new Node class wrapped Element
			head = newNode;
		}
		
		// Position != 0
		else {
			// Iterating to Position-1
			for(int i = 0; i<index-1; i++) {
				temp = temp.getNext();
			}
			
			// Saving Value into the prevNode variable
			Node<T> prevNode = temp;
			// Setting next value of prevNode into the newNode
			newNode.setNext(prevNode.getNext());
			// Setting newNode value into temp's place
			temp.setNext(newNode);
		}
	}

	// Function to return the Length of LinkedList
	public int length() {
		return this.length;
	}

	// Function to display the Elements of a LinkedList: taking LinkedList head as an argument
	public void display(Node<T> head) {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getElement() + " ");
			temp = temp.getNext();
		}
	}
	
	// Using recursion: Function to display the Elements of a LinkedList: taking LinkedList head as an argument
	public void displayRecur(Node<T> l) {
		if(l != null) {
			System.out.print(l.getElement() + " ");
			displayRecur(l.getNext());
		}
	}
	
	// Function to display the Elements of a LinkedList in reverse order using Stacks
	public void displayRev() {
		
		// Saving the value of head into temp
		Node<T> temp = head;
		
		// Initializing a new Stack
		Stack<T> stack = new Stack<>();
		
		// Iterating over the LinkedList
		while(temp!=null) {
			// Pushing the Elements to Stack
			stack.push(temp.getElement());
			temp = temp.getNext();
		}
		// Printing the value of Elements from Stack until Stack is empty
		while(!stack.isEmpty()) {
			// Poping the elements from the Stack and Printing them 
			System.out.print(stack.pop() + " ");
		}
	}
	
	// Function to Find an Element in the LinkedList: passing an Element as an argument
	public int find(int element) {
		// Saving the head value into temp
		Node<T> temp = head;
		//Initializing counter
		int counter = 0;
		
		// Iterating over the LinkedList till temp returns null
		while (temp != null) {
			// Checking if the Element in the temp match the Element passed in the argument
			if (temp.getElement().equals(element))
				// Returning position of the Element
				return counter;
			
			// Iterating the value of temp
			temp = temp.getNext();
			// Iterating value of counter
			counter++;
			}
		// Return -1 if Element not found
		return -1;
	}
	
	// Function to get an Element in the LinkedList: passing the position as an argument
	public T get(int position) {
		// Saving the value of head in temp
		Node<T> temp = head;
		// Position ==0 : Returning head Element
		if (position == 0) {
			return head.getElement();
		}
		else {
			// Position != 0
			// Iterating over the LinkedList till Position and saving the value in temp
			for(int i=0; i<position; i++) {
				temp = temp.getNext();
			}
			// Returning the Element in temp at the said position
			return temp.getElement();
		}
	}
}
