package challenges;

import java.util.Arrays;

/**
 * LengthOfLastWord description.
 *
 * @author Daniel
 * @version 12/04/2024
 */
public class LengthOfLastWord {

  public static void main(String[] args) {
    System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
  }

  private static int lengthOfLastWord(String s) {
    String[] splitedString = s.split(" ");
    for (int i = splitedString.length - 1; i >= 0; i--) {
      if (splitedString[i].length() > 0) {
        return splitedString[i].length();
      }
    }
    return 0;
  }

  private static int lengthOfLastWord2(String s) {
    String[] splitedString = s.split(" ");
    return splitedString[splitedString.length - 1].length();
  }

}
