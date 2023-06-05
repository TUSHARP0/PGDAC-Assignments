import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your number: ");
            int num = in.nextInt();

            int sum = num*(num+1)/2;

            System.out.println("The sum till " + num + " numbers is: " + sum);
        }
    }
}
