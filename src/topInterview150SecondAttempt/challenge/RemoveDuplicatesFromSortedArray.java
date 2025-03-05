package topInterview150SecondAttempt.challenge;

import java.util.Arrays;

/**
 * RemoveDuplicatesFromSortedArray description.
 *
 * @author Daniel
 * @version 05/03/2025
 */
public class RemoveDuplicatesFromSortedArray {
  private static int removeDuplicates(int[] nums) {

    int currentValue = nums[0];
    int lastRepeatedIndex = 1;
    int switchVar;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > currentValue) {
        switchVar = nums[i];
        nums[i] = nums[lastRepeatedIndex];
        nums[lastRepeatedIndex] = switchVar;
        lastRepeatedIndex++;
        currentValue = switchVar;
      }
    }

    return lastRepeatedIndex;
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{1,1,2}));
    System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
  }

}
