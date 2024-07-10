import java.util.Arrays;
import java.util.Scanner;

public class StringSorter {

    // User-defined method to sort an array of strings (Bubble Sort)
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings;

        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left-over

        strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sort using inbuilt method (Arrays.sort)");
            System.out.println("2. Sort using user-defined method (Bubble Sort)");
            System.out.println("3. Display the array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Arrays.sort(strings);
                    System.out.println("Array sorted using inbuilt method.");
                    break;
                case 2:
                    bubbleSort(strings);
                    System.out.println("Array sorted using user-defined method.");
                    break;
                case 3:
                    System.out.println("Array elements:");
                    for (String str : strings) {
                        System.out.println(str);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

