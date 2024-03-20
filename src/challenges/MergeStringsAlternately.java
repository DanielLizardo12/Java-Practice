package challenges;

/**
 * MergeStringsAlternately description.
 *
 * @author Daniel
 * @version 20/03/2024
 */
public class MergeStringsAlternately {

  public static void main(String[] args) {
    System.out.println(mergeAlternately("abc", "pqr"));
  }

  private static String mergeAlternately(String word1, String word2) {
    String newWord = "";

    for (int i = 0; i < word1.length(); i++) {
      newWord += word1.charAt(i);
      if (word2.length() > i) {
        newWord +=word2.charAt(i);
      }
    }

    if (word2.length() > word1.length()) {
      newWord += word2.substring(word1.length());
    }

    return newWord;
  }

}
