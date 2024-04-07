import java.util.Scanner;

public class problem2 {

    public static double findAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double average = findAverage(array);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
