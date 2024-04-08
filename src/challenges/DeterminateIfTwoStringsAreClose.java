package challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * DeterminateIfTwoStringsAreClose description.
 *
 * @author Daniel
 * @version 01/04/2024
 */
public class DeterminateIfTwoStringsAreClose {

  public static void main(String[] args) {
    System.out.println(closeStrings("abbzzca", "babzzcz"));
  }

  private static boolean closeStrings(String word1, String word2) {
    if (word1.length() != word2.length()) return false;
    int[] test = new int[]{2,3,1};
    Arrays.sort(test);
    System.out.println(Arrays.toString(test));
    Set<Character> word1Set = new HashSet<>();
    Set<Character> word2Set = new HashSet<>();

    for (int i = 0; i < word1.length(); i++) {
      word1Set.add(word1.charAt(i));
      word2Set.add(word2.charAt(i));
    }

    System.out.println(word1Set);
    System.out.println(word2Set);

    return word1Set.containsAll(word2Set) && word1Set.size() == word2Set.size();
  }

}
