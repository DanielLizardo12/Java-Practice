package challenges;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * BagOfTokens description.
 *
 * @author Daniel
 * @version 11/03/2024
 */
public class BagOfTokens {

  public static void main(String[] args) {
    bagOfTokensScore(new int[]{500,400,300,200,100}, 1);
  }

  public static int bagOfTokensScore(int[] tokens, int power) {

    if (tokens.length == 1) {
      return tokens[0] <= power ? 1 : 0;
    }

    int[] sortedArray = sortInts(tokens);

    int n = tokens.length;
    int left = 0;
    int right =n - 1;
    int index = n - 1;
    int score = 0;



    return 1;
  }

  public static int[] sortInts(int[] tokens) {
    int n = tokens.length;
    int[] sortedArray = new int[n];
    int left = 0;
    int right =n - 1;
    int index = n - 1;

    while (left <= right) {
      if (tokens[left] > tokens[right]) {
        sortedArray[index--] = tokens[left];
        left++;
      } else {
        sortedArray[index--] = tokens[right];
        right--;
      }
    }
    return sortedArray;
  }

}
