package topInterview150.challenge;

/**
 * StringCompare description.
 *
 * @author Daniel
 * @version 25/02/2024
 */
public class StringCompare {

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    for (int i = 1; i < s.length() - k + 1; i++) {

      String substring = s.substring(i, i + k);

      if (verifySmallestOrLargest(substring, smallest, 0, true)) {
        smallest = substring;
      }

      if (verifySmallestOrLargest(substring, largest, 0, false)) {
        largest = substring;
      }
    }

    return smallest + "\n" + largest;
  }

  public static boolean verifySmallestOrLargest(String substring, String string, int index,
      boolean smallest) {

    if (index >= substring.length() || index >= string.length()) {
      // Reached end of one of the strings, consider it smaller/larger
      return index >= substring.length();
    }

    if (substring.charAt(index) == string.charAt(index))
      return verifySmallestOrLargest(substring, string, index + 1, smallest);

    if (smallest) {
      return substring.charAt(index) < string.charAt(index);
    } else {
      return substring.charAt(index) > string.charAt(index);
    }

  }

  public static void main(String[] args) {
    System.out.println(getSmallestAndLargest("welcometojava", 3));
  }

}
