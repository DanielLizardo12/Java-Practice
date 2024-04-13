package topInterview150.challenge;

import java.util.HashMap;

/**
 * RansomNote description.
 *
 * @author Daniel
 * @version 12/04/2024
 */
public class RansomNote {

  public static void main(String[] args) {
    System.out.println(canConstruct("aa", "ab"));
  }

  private static boolean canConstruct(String ransomNote, String magazine) {

    HashMap<Character, Integer> seen = new HashMap<>();

    for (int i = 0; i < magazine.length(); i++) {
      seen.put(magazine.charAt(i), seen.getOrDefault(magazine.charAt(i), 0) + 1);
    }

    System.out.println(seen);

    char letter;

    for (int i = 0; i < ransomNote.length(); i++) {
      letter = ransomNote.charAt(i);
      if (seen.containsKey(letter)) {
        if (seen.get(letter) > 1) {
          seen.put(letter, seen.get(letter) - 1);
        } else if (seen.get(letter) == 1) {
          seen.remove(letter);
        }
      } else {
        return false;
      }
    }

    return true;
  }

}
