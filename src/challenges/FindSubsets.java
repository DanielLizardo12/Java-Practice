package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * FindSubsets description.
 *
 * @author Daniel
 * @version 02/04/2024
 */
public class FindSubsets {

  public static void main(String[] args) {
    // Input array of numbers
    int[] nums = {1, 5, 3};
    // Find all subsets
    List<List<Integer>> subsets = findSubsets(nums);
    // Print all subsets
    System.out.println("All subsets: " + subsets);
  }

  private static List<List<Integer>> findSubsets(int[] nums) {
    // Initialize a list to store all subsets
    List<List<Integer>> subsets = new ArrayList<>();

    // Start with an empty subset
    subsets.add(new ArrayList<>());

    // Iterate through each number in the input array
    for (int num : nums) {
      // Get the current number of subsets
      int n = subsets.size();
      // Iterate through each existing subset
      for (int i = 0; i < n; i++) {
        // Create a new subset by copying an existing one
        List<Integer> subset = new ArrayList<>(subsets.get(i));
        // Add the current number to the new subset
        subset.add(num);
        // Add the new subset to the list of subsets
        subsets.add(subset);
      }
    }

    // Return the list of all generated subsets
    return subsets;

  }
}
