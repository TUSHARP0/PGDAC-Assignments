public class TesterQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        System.out.println(queue.isEmpty());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.length());

        System.out.println(queue.isEmpty());

        queue.display();

        queue.remove();
        queue.remove();

        queue.display();
        queue.add(60);
        queue.add(70);

        queue.display();
    }
}
