package challenges;

import java.util.Arrays;
import java.util.HashMap;

/**
 * MaxNumberOfKSumsPairs description.
 *
 * @author Daniel
 * @version 31/03/2024
 */
public class MaxNumberOfKSumsPairs {

  public static void main(String[] args) {
    System.out.println(maxOperationsTwoPointers(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3));
  }

  private static int maxOperationsTwoPointers(int[] nums, int k) {
    int kSums = 0;
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      if (nums[left] + nums[right] == k) {
        kSums++;
        left++;
        right--;
      } else if (nums[left] + nums[right] < k) {
        left++;
      } else {
        right--;
      }
    }
    return kSums;
  }

  private static int maxOperationsInitial(int[] nums, int k) {
    HashMap<Integer, Integer> seen =  new HashMap<>();
    int kSums = 0;
    int needed;

    for (int num: nums) {
      needed = k - num;
      if (seen.containsKey(needed)) {
        if (seen.get(needed) == 1) {
          seen.remove(needed);
        } else {
          seen.put(needed, seen.get(needed) - 1);
        }
        kSums++;
      } else {
        if (seen.containsKey(num)) {
          seen.put(num, seen.get(num) + 1);
        } else {
          seen.put(num, 1);
        }
      }
    }
    return kSums;
  }

}
