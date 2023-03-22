package challenges;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Daniel
 * @Date 21/03/2023
 */

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Find the index of the smallest element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the smallest element with the first element of the unsorted part of the array
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        // Return the sorted array
        return array;
    }
}
