public class Queue<T> {
    private Node<T> key;
    private int length = 0;

    public boolean add(T element) {

        Node<T> newNode = new Node<>(element);

        if (this.key == null){
            this.key = newNode;
            length++;
            return true;
        }

        Node<T> temp = key;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        length++;
        return true;
    }

    public boolean remove(){
        if(this.key == null){
            return false;
        }

        this.key = this.key.getNext();
        length--;
        return true;
    }

    public boolean isEmpty(){
        if(this.key == null)
            return true;
        return false;
    }

    public void display(){
        if (this.key == null)
            return;

        Node<T> temp = key;

        while(temp != null){
            System.out.print(temp.getElement() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int length(){
        if (this.key == null)
            return 0;
        return length;
    }
}
