package topInterview150.challenge;

/**
 * consistentStrings description.
 *
 * @author Daniel
 * @version 10/03/2024
 */
public class consistentStrings {

  public static void main(String[] args) {
    System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
  }

  public static int countConsistentStrings(String allowed, String[] words) {
    int counter = words.length;
    for (String word : words) {
      for (int i = 0; i < word.length(); i++) {
        if (!allowed.contains(word.substring(i, i + 1))) {
          counter--;
          break;
        }
      }
    }
    return counter;
  }

}
