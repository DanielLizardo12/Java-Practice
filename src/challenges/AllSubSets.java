package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @Date 13/03/2023
 */
public class AllSubSets {

    public static List<List<Integer>> subsets(int[] numbers) {
        List<List<Integer>> output = new ArrayList<>();
        helper(numbers, 0, new ArrayList<>(), output);
        return output;
    }

    private static void helper(int[] numbers, int index, List<Integer> subSet, List<List<Integer>> output) {
        if (index == numbers.length) {
            output.add(new ArrayList<>(subSet));
            return;
        }
        // don't add
        helper(numbers, index + 1, subSet, output);

        // add
        subSet.add(numbers[index]);
        helper(numbers, index + 1, subSet, output);
        subSet.remove(subSet.size() - 1);
    }
}
