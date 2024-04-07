import java.util.Scanner;

public class problem7 {

    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: if start index is greater or equal to end index, stop recursion
        }

        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with start index incremented and end index decremented
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        reverse(array, 0, n - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
