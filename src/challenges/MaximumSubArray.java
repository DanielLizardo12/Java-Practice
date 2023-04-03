package challenges;

/**
 * @author Daniel
 * @Date 03/04/2023
 */

public class MaximumSubArray {

    public static int maxSubArray(int[] ints) {
        // Initialize the current and maximum sum to the value of the first element in the array
        int maxSum = ints[0];
        int currentSum = ints[0];

        // Iterate through the array, starting from the second element
        for (int i = 1; i < ints.length; i++) {
            // Compare currentSum with zero
            if (currentSum < 0) {
                // If currentSum is negative, start a new subArray at the current element
                currentSum = ints[i];
            } else {

                // If currentSum is positive, continue adding elements to the subArray
                currentSum += ints[i];
            }

            // Update the maximum sum if the current sum is greater than the previous maximum sum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        // Return the maximum sum found
        return maxSum;
    }
}
