import java.util.*;

public class sortbubbleoptimized {

    // Optimized Bubble Sort Method
    public static void bubbleSort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {

            boolean swapped = false; // to check if swapping happens

            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap in this pass, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        int arr[] = {5, 4, 1, 3, 2};

        System.out.println("Before Sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
