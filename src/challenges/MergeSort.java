package challenges;

/**
 * @author Daniel
 * @Date 22/03/2023
 */

public class MergeSort {

    /**
     * Sorts an integer array using Merge Sort algorithm.
     *
     * Time Complexity: O(n log n), where n is the size of the input array.
     * Space Complexity: O(n), as it requires an auxiliary array of the same size as input array.
     *
     * @param arr The array to be sorted.
     * @return The sorted array.
     */
    public static int[] mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr; // Nothing to sort
        }
        int[] aux = new int[arr.length]; // Create an auxiliary array of the same size as input array
        mergeSortHelper(arr, aux, 0, arr.length - 1); // Call the merge sort helper method to sort the array
        return arr;
    }

    /**
     * A helper method to recursively sort an array using Merge Sort algorithm.
     *
     * @param arr The array to be sorted.
     * @param aux An auxiliary array of the same size as the input array.
     * @param start The starting index of the sub-array to be sorted.
     * @param end The ending index of the sub-array to be sorted.
     */
    private static void mergeSortHelper(int[] arr, int[] aux, int start, int end) {
        if (start >= end) {
            return; // Base case, single element
        }
        int mid = (start + end) / 2; // Calculate the mid-point of the sub-array
        mergeSortHelper(arr, aux, start, mid); // Recursively sort the left half of the sub-array
        mergeSortHelper(arr, aux, mid + 1, end); // Recursively sort the right half of the sub-array
        merge(arr, aux, start, mid, end); // Merge the two halves into a sorted sub-array
    }

    /**
     * A helper method to merge two sorted sub-arrays into a single sorted sub-array.
     *
     * @param arr The original array containing the sub-arrays to be merged.
     * @param aux An auxiliary array used to store the merged sub-array.
     * @param start The starting index of the left sub-array.
     * @param mid The ending index of the left sub-array.
     * @param end The ending index of the right sub-array.
     */
    private static void merge(int[] arr, int[] aux, int start, int mid, int end) {
        // Copy the sub-array to be sorted to the auxiliary array
        for (int i = start; i <= end; i++) {
            aux[i] = arr[i];
        }

        // Merge the two sorted sub-arrays into a single sorted sub-array
        int i = start;
        int j = mid + 1;
        for (int k = start; k <= end; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > end) {
                arr[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                arr[k] = aux[j++];
            } else {
                arr[k] = aux[i++];
            }
        }
    }
}
