package challenges;

/**
 * FindTheIndexOfTheFirstOccurrenceInAString description.
 *
 * @author Daniel
 * @version 12/04/2024
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

  public static void main(String[] args) {
    System.out.println(strStr1("mississippi", "issip"));
  }
  private static int strStr1(String haystack, String needle) {
    return haystack.indexOf(needle);
  }

  private static int strStr(String haystack, String needle) {
    int needleLength = needle.length() - 1;
    int needleIndex = 0;

    for (int i = 0; i < haystack.length(); i++) {
      if (haystack.charAt(i) == needle.charAt(needleIndex)) {
        if (needleIndex == needleLength) return i - needleIndex;
        needleIndex++;
      } else {
        needleIndex = 0;
        i = i - needleIndex;
        i--;
      }
    }

    return -1;
  }

}
