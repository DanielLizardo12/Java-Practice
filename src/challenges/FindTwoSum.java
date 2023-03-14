package challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniel
 * @Date 01/03/2023
 */

public class FindTwoSum {

    //you are given an array of integers and another integer targetValue.
    // write a function in java that will take this inputs and return the indices of the 2
    // integers in the array that add up to targetValue.

    //we can assume that only one pair of numbers will sum to targetValue, if there are non
    //or only one value in the array we should return an empty array.
    public static void main(String[] args) {
        int[] ints = new int[]{12, 8, 3, 1, -1};
        System.out.println(Arrays.toString(findTwoSum(ints, 2)));
    }

    //time complexity O(n), in the worst case scenario we will loop into all the elements once
    //before finding two elements with the correct sum.

    //return new int[]{} takes less memory than new int[0] since they both create an array with zero length
    //but new int[0] initializes its first element to zero and new int[]{} creates no elements.
    public static int[] findTwoSum(int[] ints, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            int complement = target - ints[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(ints[i], i);
        }
        return new int[]{};
    }
}
