package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ReverseVowelsOfAString description.
 *
 * @author Daniel
 * @version 25/03/2024
 */
public class ReverseVowelsOfAString {

  public static void main(String[] args) {
    System.out.println(reverseVowels("leetcode"));
  }

  private static String reverseVowels(String s) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    StringBuilder reversedVowels = new StringBuilder(s);

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      char leftChar = s.charAt(left);
      char rightChar = s.charAt(right);

      if (!vowels.contains(leftChar)) {
        left++;
        continue;
      }

      if (!vowels.contains(rightChar)) {
        right--;
        continue;
      }

      // Swap vowels
      reversedVowels.setCharAt(left, rightChar);
      reversedVowels.setCharAt(right, leftChar);

      left++;
      right--;
    }

    return reversedVowels.toString();
  }

}