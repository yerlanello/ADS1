import java.util.Scanner;

public class problem6 {

    public static double power(double a, int n) {
        if (n == 0) {
            return 1; // Anything to the power of 0 is 1
        } else if (n > 0) {
            return a * power(a, n - 1); // Recursive call for positive n: a^n = a * a^(n-1)
        } else {
            return 1 / (a * power(a, -n - 1)); // Recursive call for negative n: a^(-n) = 1 / (a * a^(-n-1))
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        double result = power(a, n);
        System.out.println(result);

        scanner.close();
    }
}
