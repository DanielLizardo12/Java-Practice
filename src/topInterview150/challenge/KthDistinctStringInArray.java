package topInterview150.challenge;

import java.util.LinkedHashMap;

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
    LinkedHashMap<String, Integer> seen = new LinkedHashMap<>();

    for (String s : arr) {
      if (seen.containsKey(s)) {
        seen.put(s, seen.get(s) + 1);
      } else {
        seen.put(s, 1);
      }
    }

    for (String key: seen.keySet()) {
        if (seen.get(key) == 1) {
          if (k == 1) {
            return key;
          } else {
            k--;
          }
        }
    }

    return "";
  }

}
