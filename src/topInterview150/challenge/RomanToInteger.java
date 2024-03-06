package topInterview150.challenge;

import java.util.HashMap;

/**
 * RomanToInteger description.
 *
 * @author Daniel
 * @version 05/03/2024
 */
public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(romanToInt("III"));
  }

  public static int romanToInt(String s) {
    HashMap<Character, Integer> hierarchy = new HashMap<>();
    hierarchy.put('I', 1);
    hierarchy.put('V', 5);
    hierarchy.put('X', 10);
    hierarchy.put('L', 50);
    hierarchy.put('C', 100);
    hierarchy.put('D', 500);
    hierarchy.put('M', 1000);

    int totalNumber = 0;

    for (int i = 0; i < s.length(); i++) {
      if (i + 1 > s.length()) {
        if (hierarchy.get(s.charAt(i)) >= hierarchy.get(s.charAt(i + 1))) {
          totalNumber += hierarchy.get(s.charAt(i + 1)) - hierarchy.get(s.charAt(i));
          ++i;
        }
      }
      totalNumber += hierarchy.get(s.charAt(i));
    }

    return totalNumber;

  }

}
