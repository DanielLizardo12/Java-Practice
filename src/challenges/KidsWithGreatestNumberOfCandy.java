package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * KidsWithGreatestNumberOfCandy description.
 *
 * @author Daniel
 * @version 20/03/2024
 */
public class KidsWithGreatestNumberOfCandy {

  public static void main(String[] args) {
    System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

    int kidWithMoreCandies = 0;
    List<Boolean> result = new ArrayList<>();

    for (int candy : candies) {
      kidWithMoreCandies = Math.max(kidWithMoreCandies, candy);
    }

    if (extraCandies >= kidWithMoreCandies) {
      for (int i = 0; i < candies.length; i++) {
        result.add(true);
      }
      return result;
    }

    for (int candy : candies) {
      result.add(candy + extraCandies >= kidWithMoreCandies);
    }

    return result;
  }

}
