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
//    System.out.println(canJump2(new int[]{2,3,1,1,4}));
    System.out.println(canJump2(new int[]{3,2,1,0,4}));
//    System.out.println(canJump2(new int[]{0}));
//    System.out.println(canJump2(new int[]{0,1}));
//    System.out.println(canJump2(new int[]{2,0}));
//    System.out.println(canJump2(new int[]{3,0,8,2,0,0,1}));
//    System.out.println(canJump2(new int[]{5,9,3,2,1,0,2,3,3,1,0,0}));
//    System.out.println(canJump2(new int[]{4,2,0,0,1,1,4,4,4,0,4,0}));
  }

  private static boolean canJump2(int[] nums) {
    int currMaxNonZeroJump = 0;
    int nextCurrIndex = 0;
    int currentIndex = 0;


    while (currentIndex < nums.length) {
      for (int i = currentIndex + 1; i < (currentIndex + 1) + nums[currentIndex]; i++) {

        if (nums[i] + i >= nums.length - 1) return true;

        if (nums[i] + i > currMaxNonZeroJump && nums[i] != 0) {
          currMaxNonZeroJump = nums[i];
          nextCurrIndex = i;
        }

      }
      currMaxNonZeroJump = 0;
      currentIndex = nextCurrIndex;
    }
    return false;
  }

  private static boolean canJump(int[] nums) {

    if (nums.length == 1 || nums[0] >= nums.length - 1) return true;
    if (nums[0] == 0) return false;

    HashMap<Integer, Integer> seenElements = new HashMap<>();

    for (int i = 0; i <nums.length ; i++) {
      seenElements.put(i, nums[i]);
    }

    int currIndex = 0;
    int maxJumpInSubIndex = 0;
    int nextCurrIndex = 0;
    int currentLoopCount = 0;

    while (currIndex < nums.length) {

      for (int i = currIndex + 1; i < (currIndex + 1) + nums[currIndex]; i++) {
        currentLoopCount += nums[i];
        if (seenElements.get(i) >= maxJumpInSubIndex) {
          maxJumpInSubIndex = seenElements.get(i);
          nextCurrIndex = i;
        }

        if (nextCurrIndex + maxJumpInSubIndex >= nums.length - 1 ) {
          return true;
        }

      }
      if (currentLoopCount == 0) {
        nums[currIndex] = 0;
        currIndex = 0;
      } else {
        currIndex = nextCurrIndex;
      }
      currentLoopCount = 0;
      maxJumpInSubIndex = 0;
      
    }

    return false;
  }

}
