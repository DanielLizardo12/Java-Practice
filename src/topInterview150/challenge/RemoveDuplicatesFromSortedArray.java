package topInterview150.challenge;

import java.util.Arrays;
import java.util.HashMap;

/**
 * RemoveDuplicatesFromSortedArray description.
 *
 * @author Daniel
 * @version 17/02/2024
 */
public class RemoveDuplicatesFromSortedArray {

  public static int removeDuplicates(int[] nums) {

    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int prevElement = nums[nums.length - 1];
    int newPrevElement = 0;
    int newLastElement = 0;

    for (int i = 0; i < nums.length; i++) {
      hashMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = nums[i]; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          newLastElement = nums[i];
          for (int k = nums.length; k > i; k--) {
            newPrevElement = nums[k - 1];
            nums[k - 1] = prevElement;
            prevElement = newPrevElement;
          }
          nums[nums.length - 1] = newLastElement;
          i++;
        }
      }
    }
    Arrays.stream(nums).forEach(System.out::print);
    return hashMap.size();
  }

}
