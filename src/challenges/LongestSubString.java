package challenges;

import java.util.HashMap;

/**
 * @author Daniel
 * @Date 15/03/2023
 */

public class LongestSubString {

    public static int lengthOfLongestSubString(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int startIndex = 0;
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (shouldUpdateSubstring(charIndexMap, s.charAt(i), startIndex, i)) {
                startIndex = charIndexMap.get(s.charAt(i)) + 1;
                charIndexMap.put(s.charAt(i), i);
                i = startIndex;
                currentLength = 1;
            } else {
                charIndexMap.put(s.charAt(i), i);
                currentLength++;
                if (currentLength > maxLength) maxLength = currentLength;
            }

        }

        return maxLength;
    }

    private static boolean shouldUpdateSubstring(HashMap<Character, Integer> seen, char c, int start, int index) {
        return seen.containsKey(c) && (start < seen.get(c) + 1) && !(seen.get(c) == index);
    }

}
