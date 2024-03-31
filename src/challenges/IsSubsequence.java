package challenges;

/**
 * IsSubsequence description.
 *
 * @author Daniel
 * @version 31/03/2024
 */
public class IsSubsequence {

  public static void main(String[] args) {
    System.out.println(isSubsequence("abc", "ahbgdc"));
  }

  private static boolean isSubsequence(String s, String t) {

    if (s.length() == 0) return true;

    int subSequenceIndexCounter = 0;
    StringBuilder stringBuilder =  new StringBuilder();

    for (int i = 0; i < t.length(); i++) {

      if (t.charAt(i) == s.charAt(subSequenceIndexCounter)) {
        stringBuilder.append(t.charAt(i));
        subSequenceIndexCounter++;
      };

      if (stringBuilder.toString().equals(s)) return true;
    }

    return false;
  }

}
