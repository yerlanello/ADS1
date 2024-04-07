import java.util.Scanner;

public class problem4 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * factorial(n - 1); // Recursive call: n! = n * (n-1)!
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println(result);

        scanner.close();
    }
}
