import java.util.Scanner;

public class problem1 {

    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0]; // Assume the first element is the minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update the minimum if a smaller element is found
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements separated by spaces: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] array = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }

        int min = findMinimum(array);
        System.out.println("Minimum element: " + min);

        scanner.close();
    }
}
