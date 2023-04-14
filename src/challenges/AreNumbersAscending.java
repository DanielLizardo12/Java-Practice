package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniel
 * @Date 14/04/2023
 */

public class AreNumbersAscending {

    public static boolean areNumbersAscending(String s) {

        String[] strings = s.split(" ");

        List<Integer> integerList =
                Arrays.stream(strings)
                        .filter(AreNumbersAscending::isInteger)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i - 1) >= integerList.get(i)) return false;
        }

        return true;
    }

    private static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
