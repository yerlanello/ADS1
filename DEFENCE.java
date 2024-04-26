//we have the string and need to find countity of given letter
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        char target = scanner.next().charAt(0);

        int count = countLetter(str, target, 0);

        System.out.println("The count of '" + target + "' in the string is: " + count);

        scanner.close();
    }

    public static int countLetter(String str, char target, int index) {
        if (index == str.length()) {
            return 0;
        }

        int count = (str.charAt(index) == target) ? 1 : 0;

        return count + countLetter(str, target, index + 1);
    }
}
