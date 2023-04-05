package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @Date 08/03/2023
 */

public class Permutation {

    public static List<int[]> permute(int[] nums) {
        List<int[]> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    private static void permute(int[] nums, int start, List<int[]> result) {
        // If we've reached the end of the array, we've generated a permutation.
        // Add the permutation to the result list.
        if (start == nums.length) {
            result.add(nums.clone());
            return;
        }

        // For each element in the array from the current start position to the end,
        // swap it with the element at the start position and generate permutations
        // for the remaining elements.
        for (int i = start; i < nums.length; i++) {
            // Swap the elements at positions start and i.
            swap(nums, start, i);

            // Recursively generate permutations for the remaining elements.
            permute(nums, start + 1, result);

            // Swap the elements back to their original positions.
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
