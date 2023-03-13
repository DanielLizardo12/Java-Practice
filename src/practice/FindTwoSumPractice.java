package practice;

import java.util.HashMap;

/**
 * @author Daniel
 * @Date 12/03/2023
 */
public class FindTwoSumPractice {

    public static int[] findTwoSum(int[] intsArray, int targetValue) {
        HashMap<Integer, Integer> storedIntsArrayValues = new HashMap<>();
        int missingValue;

        for (int i = 0; i < intsArray.length; i++) {
            missingValue = targetValue -  intsArray[i];
            if (storedIntsArrayValues.containsKey(missingValue)) {
                return new int[]{storedIntsArrayValues.get(missingValue), i};
            }
            storedIntsArrayValues.put(intsArray[i], i);
        }
        return new int[]{};
    }
}
