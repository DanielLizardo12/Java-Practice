package challenges;

import java.util.HashMap;

/**
 * @author Daniel
 * @Date 15/03/2023
 */

public class LongestSubString {

    public static int lengthOfLongestSubString(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int start = 0;
        int max = 0;
        int currentSubStringLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (shouldUpdateSubstring(seen, s.charAt(i), start, i)) {
                start = seen.get(s.charAt(i)) + 1;
                seen.put(s.charAt(i), i);
                i = start;
                currentSubStringLength = 1;
            } else {
                seen.put(s.charAt(i), i);
                currentSubStringLength++;
                if (currentSubStringLength > max) max = currentSubStringLength;
            }

        }

        return max;
    }

    private static boolean shouldUpdateSubstring(HashMap<Character, Integer> seen, char c, int start, int index) {
        return seen.containsKey(c) && (start < seen.get(c) + 1) && !(seen.get(c) == index);
    }

}
