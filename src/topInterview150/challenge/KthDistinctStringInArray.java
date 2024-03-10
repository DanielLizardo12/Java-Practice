package topInterview150.challenge;

import java.util.HashMap;

/**
 * KthDistinctStringInArray description.
 *
 * @author Daniel
 * @version 10/03/2024
 */
public class KthDistinctStringInArray {

  public static void main(String[] args) {
    System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"}, 2));
  }

  public static String kthDistinct(String[] arr, int k) {
    HashMap<String, Integer> seen = new HashMap<>();

    for (String s : arr) {
      if (seen.containsKey(s)) {
        seen.put(s, seen.get(s) + 1);
      } else {
        seen.put(s, 1);
      }
    }

    int counterK = 1;
    for (String s : arr) {
      if (seen.get(s) == 1) {
        if (counterK == k) {
          return s;
        } else {
          counterK++;
        }
      }
    }
    return "";
  }

}
