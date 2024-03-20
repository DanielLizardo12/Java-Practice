package challenges;

import java.util.Arrays;

/**
 * @author Daniel
 * @Date 16/03/2023
 */

public class BinarySearch {

    public static int search(int[] ints, int target) {
        Arrays.sort(ints);
        int left = 0;
        int right = ints.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (ints[middle] == target) {
                return middle;
            } else if (ints[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
