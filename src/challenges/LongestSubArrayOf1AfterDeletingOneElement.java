package challenges;

/**
 * LongestSubArrayOf1AfterDeletingOneElement description.
 *
 * @author Daniel
 * @version 01/04/2024
 */
public class LongestSubArrayOf1AfterDeletingOneElement {

  public static void main(String[] args) {
    //System.out.println(longestSubArray(new int[]{1,1,0,1}));
    //System.out.println(longestSubArray(new int[]{0,1,1,1,0,1,1,0,1}));
    //System.out.println(longestSubArray(new int[]{1,1,1}));
    System.out.println(longestSubArray(new int[]{1,1,0,0,1,1,1,0,1}));
  }

  private static int longestSubArray(int[] nums) {

    int current1Count = 0;
    int max1Count = 0;
    boolean removedUsed = false;
    int removedIndex = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        current1Count++;
      } else if (nums[i] == 0 && removedUsed) {
        if (removedIndex < i - current1Count) {
          max1Count = Math.max(max1Count, current1Count);
          current1Count--;
          removedUsed = false;
        }
      } else if (nums[i] == 0) {
        removedUsed = true;
        removedIndex = i;
      }
    }
    max1Count = Math.max(max1Count, current1Count);
    return max1Count == nums.length ? max1Count - 1: max1Count;
  }

}
