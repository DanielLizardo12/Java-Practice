package topInterview150.challenge;

import java.util.ArrayList;

/**
 * MinimumTimeTypewriter description.
 *
 * @author Daniel
 * @version 06/03/2024
 */
public class MinimumTimeTypewriter {

  public static void main(String[] args) {
    //System.out.println(minTimeToType("abc"));
    System.out.println(minTimeToType("bza"));
  }

  public static int minTimeToType(String word) {
    int counter = 0;
    int currentIndex = 97;

    for (int i = 0; i < word.length(); i++) {

      if (word.charAt(i) == currentIndex) {
        counter++;

      } else if (word.charAt(i) > currentIndex) {
        int minMoves = Math.min(((currentIndex - 96) + (122 - word.charAt(i))), (word.charAt(i) - currentIndex));
        counter += minMoves + 1;
        currentIndex = word.charAt(i);

      } else if (word.charAt(i) < currentIndex) {
        int minMoves = Math.min(((123 - currentIndex) + (word.charAt(i) - 97)), (currentIndex - word.charAt(i)));
        counter += minMoves + 1;
        currentIndex = word.charAt(i);

      }
    }

    return counter;
  }

}
