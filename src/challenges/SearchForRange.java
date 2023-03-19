package challenges;

import java.util.ArrayList;

/**
 * @author Daniel
 * @Date 18/03/2023
 */

public class SearchForRange {

    /*
     * This algorithm uses binary search to find the first and last occurrences of a target value in a sorted integer array.
     *
     * Time complexity: O(log n), where n is the length of the input array. Binary search is used to locate the first and last
     * occurrences of the target value, and each search halves the remaining search space, resulting in a logarithmic time complexity.
     *
     * Space complexity: O(1). The algorithm uses only a constant amount of additional memory to store the indices and variables
     * used in the binary search algorithm.
     */
    public static int[] searchRange(int[] arr, int target) {
        // Find the first occurrence of the target value
        int firstIndex = binarySearch(arr, target, true);
        // If the target value is not found, return [-1, -1]
        if (firstIndex == -1) {
            return new int[] {-1, -1};
        }

        // Find the last occurrence of the target value
        int lastIndex = binarySearch(arr, target, false);
        // Return the indices as an array
        return new int[] {firstIndex, lastIndex};
    }

    private static int binarySearch(int[] arr, int target, boolean findFirst) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                // If the current index contains the target value, store the result and update the search interval
                result = mid;
                if (findFirst) {
                    // If searching for the first occurrence, move the right pointer to the left to continue the search
                    right = mid - 1;
                } else {
                    // If searching for the last occurrence, move the left pointer to the right to continue the search
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                // If the current index contains a value less than the target value, move the left pointer to the right
                left = mid + 1;
            } else {
                // If the current index contains a value greater than the target value, move the right pointer to the left
                right = mid - 1;
            }
        }
        // Return the result, which will contain the index of the first or last occurrence of the target value, or -1 if the value is not found
        return result;
    }

}
