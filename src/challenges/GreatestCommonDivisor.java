package challenges;

import java.util.Arrays;

/**
 * GreatestCommonDivisor description.
 *
 * @author Daniel
 * @version 20/03/2024
 */
public class GreatestCommonDivisor {

  public static void main(String[] args) {
    System.out.println(gcdOfStrings("A", "AA"));
  }

  public static String gcdOfStrings(String str1, String str2) {

    if (str1.equals(str2)) return str1;

    String greatestCommonDivisor = "";

    for (int i = 1; i <= str1.length(); i++) {
      String substring = str1.substring(0, i);
      if (str1.split(substring).length == 0
          && str2.split(substring).length == 0) {
        greatestCommonDivisor = substring;
      }
    }

    return greatestCommonDivisor;
  }

}
