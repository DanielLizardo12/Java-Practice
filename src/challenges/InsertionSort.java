package challenges;

/**
 * @author Daniel
 * @Date 20/03/2023
 */

public class InsertionSort {

    // It has a time complexity of O(n^2) and a space complexity of O(1).
    public static int[] insertionSort(int[] array) {
        int temp;   // variable to hold the current element being inserted
        int j;      // index of the last element in the sorted subarray

        for (int i = 1; i < array.length; i++) {
            j = i - 1;
            temp = array[i];

            // Shift elements in the sorted subarray to the right until the correct position for the current element is found
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert the current element into its correct position in the sorted subarray
            array[j + 1] = temp;
        }

        // Return the sorted array
        return array;
    }

}
