public class CircularQueue<T> {
    private Node<T> key;
    private int size=0;

    public boolean add(T element){
        Node<T> newNode = new Node<>(element);

        if (this.key == null){
            this.key = newNode;
            this.key.setNext(newNode);
            size++;
            return true;
        }

        Node<T> last = this.key;
        do {
            last = last.getNext();
        }while(last.getNext() != this.key);
        newNode.setNext(last.getNext());
        last.setNext(newNode);
        size++;
        return true;
    }

    public void display() {
        if (this.key == null)
            return;

        Node<T> temp = this.key;

        do {
            System.out.print(temp.getElement() + " ");
            temp = temp.getNext();
        }while(temp != this.key);

        System.out.println();
    }

    public boolean remove() {
        if (this.key == null)
            return false;

        if(this.key.getNext() == key) {
            this.key.setNext(null);
            this.key = null;
            size--;
            return true;
        }

        Node<T> last = key;
        do {
            last = last.getNext();
        }while(last.getNext() != key);

        last.setNext(key.getNext());
//        key.setNext(key.getNext());
        key = key.getNext();
        size--;
        return true;
    }
}
