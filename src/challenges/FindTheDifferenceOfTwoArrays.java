package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * FindTheDifferenceOfTwoArrays description.
 *
 * @author Daniel
 * @version 01/04/2024
 */
public class FindTheDifferenceOfTwoArrays {

  public static void main(String[] args) {
    System.out.println(findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
  }

  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    HashSet<Integer> uniqueElementsInArray1 = new HashSet<>();
    HashSet<Integer> uniqueElementsInArray2 = new HashSet<>();

    for (int j : nums1) {
      uniqueElementsInArray1.add(j);
    }

    for (int j : nums2) {
      uniqueElementsInArray2.add(j);
      uniqueElementsInArray1.remove(j);
    }

    for (int j : nums1) {
      uniqueElementsInArray2.remove(j);
    }

    List<List<Integer>> result = new ArrayList<>();

    result.add(new ArrayList<>(uniqueElementsInArray1));
    result.add(new ArrayList<>(uniqueElementsInArray2));

    return result;
  }

}
