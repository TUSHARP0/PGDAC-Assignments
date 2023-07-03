public class CircularSSL<T> {
    private T element;
    private Node<T> head;
    private int size;

    public boolean insert(T element){

        Node<T> newNode = new Node<>(element);

        if(this.head == null){
            this.head = newNode;
            head.setNext(newNode);
            size++;
            return true;
        }

        Node<T> temp = head;

        do {
            temp = temp.getNext();
        } while (temp.getNext() != this.head);

        newNode.setNext(this.head);
        temp.setNext(newNode);
        size++;
        return true;
    }

    public void display(){
        if (this.head == null)
            return;

        Node<T> temp = head;

        do {
            System.out.print(temp.getElement() + " ");
            temp = temp.getNext();
        } while (temp!= this.head);

        System.out.println();
    }

    public boolean delelteElementAt(int index){
        if (this.head == null)
            return false;

        if(index == 0 && head.getNext() == this.head){
            this.head = null;
            size--;
            return true;
        }

        if(index == 0 && head.getNext() != this.head){
            Node<T> last = head;

            do {
                last = last.getNext();
            } while (last.getNext() != this.head);

            last.setNext(head.getNext());
            this.head = this.head.getNext();
            size--;
            return true;
        }
        if (index < size-1) {
            Node<T> temp = this.head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            size--;
            return true;
        }

        if(index == size-1) {
            Node<T> temp = this.head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(head);
            size--;
            return true;
        }
        return false;
    }

    public int length(){
        return size;
    }
}
