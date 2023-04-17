package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniel
 * @Date 17/04/2023
 */

public class DigitSum {

    public static String digitSum(String s, int k) {

        if (s.length() <= k) return s;

        String stringAfterRound = "";

        List<String> stringList = subStringByk(s, k);

        stringAfterRound += stringList.stream().map(DigitSum::summedSubString).collect(Collectors.joining());


        return digitSum(stringAfterRound, k);
    }

    private static String summedSubString(String s) {
        int summedString = 0;

        for (int i = 0; i < s.length(); i++) {
            summedString += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return String.valueOf(summedString);
    }

    private static List<String> subStringByk(String s, int k) {
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < s.length(); i += k) {
            if (i + k < s.length()) {
                stringList.add(s.substring(i, i + k));
            } else {
                stringList.add(s.substring(i));
            }

        }

        return stringList;
    }
}
