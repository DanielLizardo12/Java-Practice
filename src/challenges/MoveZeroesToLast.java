package challenges;

import java.util.Arrays;

/**
 * MoveZeroesToLast description.
 *
 * @author Daniel
 * @version 29/03/2024
 */
public class MoveZeroesToLast {

  public static void main(String[] args) {
    moveZeroes1(new int[]{0,1,0,3,12});
  }

  private static void moveZeroes(int[] nums) {

    int counter = 1;

    if (nums.length > 1) {
      if (nums[0] == 0) {
        nums[0] = nums[1];
        nums[1] = 0;
      }

      while (counter < nums.length) {
        if (nums[counter] != 0 && nums[counter - 1] == 0) {
          nums[counter - 1] = nums[counter];
          nums[counter] = 0;
          if (counter - 2 >= 0) {
            counter = counter - 2;
          } else {
            counter--;
          }

        }
        counter++;
      }
    }

    System.out.println(Arrays.toString(nums));
  }

  public static void moveZeroes1(int[] nums) {
    int i = 0;
    for (int num : nums)
      if (num != 0)
        nums[i++] = num;

    for (int j = i; j < nums.length; j++)
      nums[j] = 0;

    System.out.println(Arrays.toString(nums));
  }

}
