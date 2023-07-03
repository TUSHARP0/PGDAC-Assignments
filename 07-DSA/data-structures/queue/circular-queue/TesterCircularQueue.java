public class TesterCircularQueue {
    public static void main(String[] args) {
        CircularQueue<Integer> circularQueue = new CircularQueue<>();

        circularQueue.add(10);
        circularQueue.add(20);
        circularQueue.add(30);
        circularQueue.add(40);
        circularQueue.display();

        circularQueue.remove();
        circularQueue.display();

        circularQueue.add(50);
        circularQueue.add(60);
        circularQueue.display();

        circularQueue.remove();
        circularQueue.display();

        circularQueue.add(70);
        circularQueue.add(80);
        circularQueue.display();

        circularQueue.remove();
        circularQueue.add(90);
        circularQueue.display();
    }
}
