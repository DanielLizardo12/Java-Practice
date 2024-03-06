package topInterview150.challenge;

/**
 * palindrome description.
 *
 * @author Daniel
 * @version 25/02/2024
 */
public class Palindrome {

  public static void palindrome(String string) {

    int mid = string.length() / 2;

    int bakwardsCounter = string.length() - 1;


    for (int i = 0; i < mid; i++) {
      if (string.charAt(i) != string.charAt(bakwardsCounter)) {
        System.out.println("No");
        break;
      } else {
        bakwardsCounter--;
      }
    }

    boolean evenWord = string.length() % 2 == 0;

    if (evenWord) bakwardsCounter++;

    if(bakwardsCounter == mid) {
      System.out.println("Yes");
    }
  }

  public static void main(String[] args) {
    palindrome("aabbbbaa");
  }

}
