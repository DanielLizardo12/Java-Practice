package topInterview150SecondAttempt.challenge;

import java.util.Arrays;

/**
 * RemoveElement description.
 *
 * @author Daniel
 * @version 05/03/2025
 */
public class RemoveElement {

  private static int removeElement(int[] nums, int val) {
    int lastValIndex = nums.length - 1;
    int counter = 0;
    int switchVar;

    while (counter <= lastValIndex) {
      if (nums[counter] == val) {
        switchVar = nums[lastValIndex];
        nums[lastValIndex] = nums[counter];
        nums[counter] = switchVar;
        lastValIndex--;
      } else {
        counter++;
      }
    }

    System.out.println(Arrays.toString(nums));
    return counter;
  }

  public static void main(String[] args) {
    System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    System.out.println(removeElement(new int[]{1}, 1));
  }

}
