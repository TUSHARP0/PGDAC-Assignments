public class Stack<T> {
	private Node<T> top;
	private int count=0;

	public Node<T> getTop() {
		return top;
	}

	public void setTop(Node<T> top) {
		this.top = top;
	}

	public Stack(Node<T> top) {
		super();
		this.top = top;
	}
	
	public Stack() {
		
	}

	public boolean push(T element) {
		Node<T> newNode = new Node<>(element);
		if (this.top == null) {
			top = newNode;
			count++;
			return true;
		}
		newNode.setNext(top);
		top = newNode;
		count++;
		return true;
	}
	
	public void display() {
		Node<T> temp = this.top;
		while(temp != null) {
			System.out.print(temp.getElement() + " ");
			temp = temp.getNext();
		}
	}
	
	public T pop() {
		Node<T> temp = this.top;
		T data = temp.getElement();
		top = top.getNext();
		return data;
	}
}
