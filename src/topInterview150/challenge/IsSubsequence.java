package topInterview150.challenge;

/**
 * IsSubsequence description.
 *
 * @author Daniel
 * @version 12/04/2024
 */
public class IsSubsequence {

  public static void main(String[] args) {
    System.out.println(isSubsequence("bb", "ahbgdc"));
  }

  public static boolean isSubsequence(String s, String t) {
    if (s.length() == 0) return true;
    if (s.length() == t.length()) return s.equals(t);

    int subsequenceIndex = 0;
    int subsequenceLength = s.length();

    for (int i = 0; i < t.length(); i++) {

      if (subsequenceIndex == subsequenceLength) return true;

      if (t.charAt(i) == s.charAt(subsequenceIndex)) {
        subsequenceIndex++;
      }
    }
    return subsequenceIndex == subsequenceLength;

  }

}
