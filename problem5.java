import java.util.Scanner;

public class problem5 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: F0 = 0, F1 = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call: Fn = Fn-1 + Fn-2
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int result = fibonacci(n);
        System.out.println(result);

        scanner.close();
    }
}
