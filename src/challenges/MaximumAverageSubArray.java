package challenges;

import java.util.Arrays;
import javax.swing.plaf.IconUIResource;

/**
 * MaximumAverageSubArray description.
 *
 * @author Daniel
 * @version 31/03/2024
 */
public class MaximumAverageSubArray {

  public static void main(String[] args) {
    System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 6));
  }

  private static double findMaxAverage(int[] nums, int k) {

    int currentSum = 0;

    for (int i = 0; i < k; i++) {
      currentSum += nums[i];
    }

    double maxSum = currentSum;

    for (int i = 0; i < nums.length - k; i++) {
      currentSum = (currentSum - nums[i]) + nums[i + k];
      maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum / k;
  }



}
