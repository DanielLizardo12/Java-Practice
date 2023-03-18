package challenges;

/**
 * @author Daniel
 * @Date 16/03/2023
 */

public class SortedBinarySearch {

    public static int search(int[] ints, int target) {
        int left = 0;
        int right = ints.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;
            if (ints[middle] == target) {
                return middle;
            } else if (ints[left] <= ints[middle]) {
                if (ints[left] <= target && target < ints[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (ints[middle] < target && target <= ints[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }
}
