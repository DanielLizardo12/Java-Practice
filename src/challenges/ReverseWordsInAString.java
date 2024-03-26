package challenges;

import java.util.Arrays;

/**
 * ReverseWordsInAString description.
 *
 * @author Daniel
 * @version 26/03/2024
 */
public class ReverseWordsInAString {

  public static void main(String[] args) {
    System.out.println(reverseWords("a good   example"));
  }

  private static String reverseWords(String s) {
    String[] splitedString = s.split(" ");
    StringBuilder result = new StringBuilder();

    for (int i = splitedString.length - 1; i >= 0; i--) {
      if (splitedString[i].length() > 0) {
        result.append(splitedString[i]).append(" ");
      }
    }

    return result.substring(0, result.length() - 1);
  }

}
