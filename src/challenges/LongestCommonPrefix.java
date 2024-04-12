package challenges;

/**
 * LongestCommonPrefix description.
 *
 * @author Daniel
 * @version 12/04/2024
 */
public class LongestCommonPrefix {

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
  }

  private static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    if (strs.length == 1) return strs[0];

    StringBuilder commonPrefix = new StringBuilder(strs[0]);

    int currentArrayIndex = 1;

    while (currentArrayIndex < strs.length) {

      if (commonPrefix.length() == 0) return "";

      if (strs[currentArrayIndex].startsWith(commonPrefix.toString())) {
        currentArrayIndex++;
      } else {
        commonPrefix.deleteCharAt(commonPrefix.length() - 1);
      }

    }

    return commonPrefix.toString();
  }

}
