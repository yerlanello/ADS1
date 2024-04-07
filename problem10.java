import java.util.Scanner;

public class problem10 {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        } else {
            return gcd(b, a % b); // Recursive call: GCD(a, b) = GCD(b, a % b)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result);

        scanner.close();
    }
}
