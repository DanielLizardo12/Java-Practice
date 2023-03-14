package challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniel
 * @Date 14/03/2023
 */
public class FirstNonRepeatingCharacter {
    public static Integer firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (frequency.get(c) == 1) {
                return i;
            }
        }
        return null;
    }
}
