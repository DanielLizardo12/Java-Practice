package challenges;

/**
 * IncreasingTripletSubsequence description.
 *
 * @author Daniel
 * @version 29/03/2024
 */
public class IncreasingTripletSubsequence {

  public static void main(String[] args) {
    System.out.println(increasingTriplets1(new int[]{2,1,5,0,4,6}));
  }

  private static boolean increasingTriplet(int[] nums) {
    int smallestNumber = nums[0];
    int largestNumber = nums[nums.length - 1];
    int currentIndexOfSmallerNumber = 0;
    int currentIndexOfMaxNumber = nums.length - 1;
    for (int i = 1; i < nums.length; i++) {
      if (smallestNumber > nums[i] && i + 1 < currentIndexOfMaxNumber) {
        smallestNumber = nums[i];
        currentIndexOfSmallerNumber = i;
      }
      if (largestNumber < nums[nums.length - i - 1] && nums.length - i - 1 > currentIndexOfSmallerNumber + 1) {
        largestNumber = nums[nums.length - i - 1];
        currentIndexOfMaxNumber = nums.length - i - 1;
      }
    }

    if (!((currentIndexOfSmallerNumber + 1) == currentIndexOfMaxNumber)) {
      for (int i = currentIndexOfSmallerNumber + 1; i < currentIndexOfMaxNumber; i++) {
        if (nums[i] > smallestNumber && nums[i] < largestNumber) {
          return true;
        }
      }
    }

    return false;
  }

  private static boolean increasingTriplets1(int[] nums) {
    int firstMin = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num <= firstMin) {
        firstMin = num;
      } else if (num <= secondMin) {
        secondMin = num;
      } else {
        System.out.println(firstMin);
        System.out.println(secondMin);
        return true;
      }
    }
    return false;
  }
}
