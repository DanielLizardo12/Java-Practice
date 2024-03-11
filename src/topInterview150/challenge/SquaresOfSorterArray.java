package topInterview150.challenge;

import java.util.Arrays;

/**
 * SquaresOfSorterArray description.
 *
 * @author Daniel
 * @version 10/03/2024
 */
public class SquaresOfSorterArray {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
  }

  public static int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int left = 0;
    int right = n - 1;
    int index = n - 1;

    while (left <= right) {
      int leftSquare = nums[left] * nums[left];
      int rightSquare = nums[right] * nums[right];

      if (leftSquare > rightSquare) {
        result[index--] = leftSquare;
        left++;
      } else {
        result[index--] = rightSquare;
        right--;
      }
    }

    return result;
  }
}
