package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Anagram description.
 *
 * @author Daniel
 * @version 12/03/2024
 */
public class Anagram {

  public static void main(String[] args) {
    //System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    System.out.println(groupAnagrams(new String[]{"bdddddddddd","bbbbbbbbbbc"}));
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagrams = new HashMap<>();

    for (String word : strs) {
      int[] count = new int[26];

      for (char c : word.toCharArray()) {
        count[c - 'a']++;
      }

      StringBuilder keyBuilder = new StringBuilder();
      for (int i = 0; i < 26; i++) {
        keyBuilder.append('#');
        keyBuilder.append(count[i]);
      }

      String key = keyBuilder.toString();
      System.out.println(key);

      anagrams.putIfAbsent(key, new ArrayList<>());
      anagrams.get(key).add(word);
    }
    return new ArrayList<>(anagrams.values());
  }

}
