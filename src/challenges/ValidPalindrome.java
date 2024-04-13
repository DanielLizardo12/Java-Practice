package challenges;

/**
 * ValidPalindrome description.
 *
 * @author Daniel
 * @version 12/04/2024
 */
public class ValidPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal -- Panama"));
    System.out.println(isPalindrome("0P"));
  }

  public static boolean isPalindrome(String s) {
    s = s.toUpperCase().replaceAll("[^A-Z0-9]", "");
    System.out.println(s);
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      if (s.charAt(left) == s.charAt(right)) {
        left++;
        right--;
      } else {
        return false;
      }
    }

    return true;
  }

}
