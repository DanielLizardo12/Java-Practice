package challenges;

import java.util.Arrays;

/**
 * RemoveDuplicatesFromSortedArrayTwo description.
 *
 * @author Daniel
 * @version 30/04/2024
 */
public class RemoveDuplicatesFromSortedArrayTwo {

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
  }

  private static int removeDuplicates(int[] nums) {
    int currArrayIndex = 1;
    int currNumber = nums[0];
    int duplicatesCounter = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == currNumber && duplicatesCounter < 2) {
        nums[currArrayIndex] = nums[i];
        currArrayIndex++;
        duplicatesCounter++;
      } else if (nums[i] != currNumber) {
        nums[currArrayIndex] = nums[i];
        currArrayIndex++;
        currNumber = nums[i];
        duplicatesCounter = 1;
      }
    }

    return currArrayIndex;
  }

}
