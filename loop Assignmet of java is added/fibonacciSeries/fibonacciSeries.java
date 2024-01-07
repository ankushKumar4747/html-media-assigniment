package loop;
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series: ");

        System.out.print(firstTerm + " " + secondTerm);
        for (int i = 3; i <= n; ++i) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
