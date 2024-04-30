package challenges;

import java.util.Arrays;

/**
 * RotateArray description.
 *
 * @author Daniel
 * @version 30/04/2024
 */
public class RotateArray {

  public static void main(String[] args) {
    rotate(new int[]{1,2,3,4,5,6,7}, 3);
  }

  private static void rotate(int[] nums, int k) {
    if (nums.length == 1) return;

    k = k % nums.length;

    int[] rotatedArray = new int[nums.length];
    int currentNewArrayIndex = 0;
    int currentOriginalArrayIndex = 0;

    System.arraycopy(nums, 0, rotatedArray, 0, nums.length);

    for (int i = nums.length - k; i < nums.length; i++) {
      nums[currentNewArrayIndex] = rotatedArray[i];
      currentNewArrayIndex++;
    }

    for (int i = currentNewArrayIndex; i < nums.length; i++) {
      nums[i] = rotatedArray[currentOriginalArrayIndex];
      currentOriginalArrayIndex++;
    }

    System.out.println(Arrays.toString(nums));
  }

}
