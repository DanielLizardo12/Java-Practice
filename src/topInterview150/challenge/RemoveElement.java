package topInterview150.challenge;

import java.util.Arrays;

/**
 * RemoveElement description.
 *
 * @author Daniel
 * @version 16/02/2024
 */
public class RemoveElement {

  public static int removeElement(int[] nums, int val) {
    int total = 0;

    for (int num : nums) {
      if (num == val)
        total++;
    }

    for (int i = 0; i < nums.length - total; i++) {
      if (nums[i] == val) {
        for (int j = nums.length - 1; j >= 1; j--) {
          if (nums[j] != val) {
            nums[i] = nums[j];
            nums[j] = val;
            break;
          }
        }
      }
    }



    Arrays.stream(nums).forEach(System.out::print);

    return nums.length - total;
  }

}
