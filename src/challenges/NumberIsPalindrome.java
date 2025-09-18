package challenges;

/**
 * NumberIsPalindrome description.
 *
 * @author Daniel
 * @version 18/09/2025
 */
public class NumberIsPalindrome {

  private static boolean isPalindrome(int x) {
    if (x < 0) return false;
    String stringValueOfX = String.valueOf(x);
    int left = 0;
    int right = stringValueOfX.length() - 1;

    while (left < right) {
      if (stringValueOfX.charAt(left) != stringValueOfX.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(123454321));
  }

}
