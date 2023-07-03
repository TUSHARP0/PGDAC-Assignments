public class TesterCircularSSL {
    public static void main(String[] args) {
        CircularSSL<Integer> circularSSL = new CircularSSL<>();

        circularSSL.insert(10);
        circularSSL.insert(20);
        circularSSL.insert(30);
        circularSSL.insert(40);
        circularSSL.insert(50);
        circularSSL.insert(60);
        circularSSL.insert(70);
        circularSSL.insert(80);


        circularSSL.display();

        circularSSL.delelteElementAt(0);

        circularSSL.display();

    }
}
