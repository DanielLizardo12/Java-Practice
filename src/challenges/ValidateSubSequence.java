package challenges;

import java.util.List;
import java.util.Objects;

/**
 * @author Daniel
 * @Date 12/04/2023
 */
public class ValidateSubSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0, sequenceIndex = 0;

        while (arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (Objects.equals(array.get(arrayIndex), sequence.get(sequenceIndex))) {
                sequenceIndex++;
            }
            arrayIndex++;
        }
        return sequenceIndex == sequence.size();
    }

    public static boolean isValidSubsequenceInitialApproach(List<Integer> array, List<Integer> sequence) {

        for (Integer integer : array) {
            if (sequence.size() > 0 && Objects.equals(integer, sequence.get(0))) {
                sequence.remove(0);
            }
        }
        return sequence.size() == 0;
    }
}
