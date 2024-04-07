import java.util.Scanner;

public class problem8 {

    public static boolean allDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // If any character is not a digit, return false
            }
        }
        return true; // If all characters are digits, return true
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println(allDigits(s) ? "Yes" : "No");

        scanner.close();
    }
}
