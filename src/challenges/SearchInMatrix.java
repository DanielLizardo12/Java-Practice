package challenges;

import java.util.Arrays;

/**
 * @author Daniel
 * @Date 19/03/2023
 */

public class SearchInMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            
            if (ints[ints.length - 1] == target) return true;

            if (ints[ints.length - 1] > target) {
                return search(ints, target);
            }
        }
        return false;
    }

    public static boolean search(int[] ints, int target) {
        int left = 0;
        int right = ints.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (ints[middle] == target) {
                System.out.printf("intern Array = %s, index at array = %s%n",
                        Arrays.toString(ints), middle);
                return true;
            } else if (ints[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

}
