package topInterview150SecondAttempt.challenge;

import java.util.Arrays;

/**
 * RemoveDuplicatesFromSortedArrayTwo description.
 *
 * @author Daniel
 * @version 06/03/2025
 */
public class RemoveDuplicatesFromSortedArrayTwo {

  private static int removeDuplicatesTwo(int[] nums) {

    int currentValue = nums[0];
    int lastRepeatedIndex = 1;
    int switchVar;
    boolean alreadyRepeated = false;
    for (int i = 1; i < nums.length; i++) {

      if (nums[i] == currentValue && !alreadyRepeated) {

        alreadyRepeated = true;
        nums[lastRepeatedIndex] = currentValue;
        lastRepeatedIndex++;

      } else if (nums[i] > currentValue) {
        switchVar = nums[i];
        nums[i] = nums[lastRepeatedIndex];
        nums[lastRepeatedIndex] = switchVar;
        lastRepeatedIndex++;
        currentValue = switchVar;
        alreadyRepeated = false;
      }
    }

    return lastRepeatedIndex;
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicatesTwo(new int[]{0,0,1,1,1,1,2,3,3}));
    System.out.println(removeDuplicatesTwo(new int[]{1,1,1,2,2,3}));
  }

}
