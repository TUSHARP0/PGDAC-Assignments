public class TesterSinglyLinkedList {
    public static void main(String[] args) {
        try{
            SinglyLinkedList<Integer> l1 = new SinglyLinkedList<>();

            l1.insert(10);
            l1.insert(20);
            l1.insert(30);
            l1.insert(40);
            l1.insert(50);

            System.out.println("Elements in the Linked List");
            l1.display(l1.getHead());
            System.out.println("\n");

            System.out.println("Elements in the Linked List using Recursion");
            l1.displayRecur(l1.getHead());
            System.out.println("\n");

            System.out.println("Elements in the Linked List in Reverse");
            l1.displayRev();
            System.out.println("\n");

            System.out.println("Length of LinkedList: " + l1.length());

            System.out.println("Inserting element (60) at 0th position");
            l1.insert(60, 0);
            l1.display(l1.getHead());
            System.out.println("\n");


            System.out.println("Finding element(40) and returning position from list");
            l1.display(l1.getHead());
            System.out.println("Position: " + l1.find(40));
            System.out.println("\n");

            System.out.println("Finding element at the position(2) from list");
            l1.display(l1.getHead());
            System.out.println("Element: " + l1.get(2));
            System.out.println("\n");

        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

}
