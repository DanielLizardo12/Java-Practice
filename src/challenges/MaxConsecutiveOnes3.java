package challenges;

import java.util.HashMap;
import java.util.HashSet;

/**
 * MaxConsecutiveOnes3 description.
 *
 * @author Daniel
 * @version 31/03/2024
 */
public class MaxConsecutiveOnes3 {

  public static void main(String[] args) {
    System.out.println(longestOnes(new int[]{0,0,0,1}, 4));
  }

  private static int longestOnes(int[] nums, int k) {
    if (k == 0) return longestOnesFor0(nums);
    HashMap<Integer, Integer> flipped0Index = new HashMap<>();
    int max1Count = 0;
    int current1Count = 0;
    int currentFlipsUsed = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        current1Count++;
      }

      if (nums[i] == 0 && currentFlipsUsed < k) {
        current1Count++;
        currentFlipsUsed++;
        flipped0Index.put(currentFlipsUsed, i);
      } else if (nums[i] == 0 && currentFlipsUsed == k) {
        max1Count = Math.max(max1Count, current1Count);

        if (k > 1) {
          current1Count = flipped0Index.get(2) - flipped0Index.get(1);
          i = flipped0Index.get(2);
        } else {
          current1Count = 1;
        }
        currentFlipsUsed = 1;
        flipped0Index.clear();
        flipped0Index.put(1, i);
      }
    }

    return Math.max(max1Count, current1Count);
  }

  private static int longestOnesFor0(int[] nums) {
    int max1Count = 0;
    int current1Count = 0;

    for (int num : nums) {
      if (num == 1) {
        current1Count++;
      } else {
        max1Count = Math.max(max1Count, current1Count);
        current1Count = 0;
      }
    }

    return Math.max(max1Count, current1Count);
  }

}
