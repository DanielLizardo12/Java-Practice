package challenges;

import java.util.HashMap;

/**
 * JumpGame description.
 *
 * @author Daniel
 * @version 30/04/2024
 */
public class JumpGame {

  public static void main(String[] args) {
    System.out.println(canJump(new int[]{2,3,1,1,4}));
    System.out.println(canJump(new int[]{3,2,1,0,4}));
    System.out.println(canJump(new int[]{0}));
    System.out.println(canJump(new int[]{0,1}));
    System.out.println(canJump(new int[]{2,0}));
    System.out.println(canJump(new int[]{3,0,8,2,0,0,1}));
    System.out.println(canJump(new int[]{5,9,3,2,1,0,2,3,3,1,0,0}));
    System.out.println(canJump(new int[]{4,2,0,0,1,1,4,4,4,0,4,0}));
  }

  private static boolean canJump2(int[] nums) {
    int currMaxNonZeroJump = 0;
    int nextCurrIndex = 0;
    int currentIndex = 0;


    while (currentIndex < nums.length) {
      for (int i = currentIndex + 1; i < (currentIndex + 1) + nums[currentIndex]; i++) {

        if (nums[i] + i >= nums.length - 1) return true;

        if (nums[i] + i > currMaxNonZeroJump) {
          currMaxNonZeroJump = nums[i];
          nextCurrIndex = i;
        }

      }
      currentIndex = nextCurrIndex;
    }
    return false;
  }

  private static boolean canJump(int[] nums) {

    if (nums.length == 1 || nums[0] >= nums.length - 1) return true;
    if (nums[0] == 0) return false;

    HashMap<Integer, Integer> seenElements = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      seenElements.put(i, nums[i]);
    }

    int currIndex = 0;
    int maxJumpInSubIndex = 0;
    int nextCurrIndex = 0;
    boolean maxJumpUpdated = false;

    while (currIndex < nums.length) {

      for (int i = currIndex + 1; i < (currIndex + 1) + nums[currIndex]; i++) {
        if (seenElements.get(i) >= maxJumpInSubIndex) {
          maxJumpInSubIndex = seenElements.get(i);
          nextCurrIndex = i;
          maxJumpUpdated = true;
        }

        if (nextCurrIndex + maxJumpInSubIndex >= nums.length - 1) {
          return true;
        }

      }
      if (!maxJumpUpdated) return false;
      maxJumpUpdated = false;
      maxJumpInSubIndex = 0;
      currIndex = nextCurrIndex;
    }

    return false;
  }

}
