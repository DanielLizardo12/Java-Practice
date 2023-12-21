package challenges;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Majority Element description.
 *
 * @author Daniel
 * @version 20/12/2023
 */
public class MajorityElement {

  public static void main(String[] args) {
    System.out.println(majorityElement2(new int[]{3,2,3}));
  }

  public static int majorityElement(int[] numbers) {
    HashMap<Integer, Integer> map = new HashMap<>();

    if (numbers.length == 1) return numbers[0];

    for (int num: numbers) {
      if (map.containsKey(num)) {
        if ((map.get(num) + 1) > (numbers.length / 2)) {
          return num;
        } else  {
          map.put(num, map.get(num) + 1);
        }
      } else {
        map.put(num, 1);
      }
    }

    return 0;
  }

  public static int majorityElement2(int[] numbers) {
    if (numbers.length == 1) return numbers[0];

    numbers = Arrays.stream(numbers).sorted().toArray();

    int major = 0;
    int currentNumber = numbers[0];
    for (int number : numbers) {

      if (number == currentNumber) {
        if (major + 1 > (numbers.length / 2)) return currentNumber;
        major++;
      } else {
        major = 1;
        currentNumber = number;
      }

    }
    return 0;
  }

}
