package topInterview150.challenge;

import java.util.HashMap;

/**
 * RepeatedNTimesNumber description.
 *
 * @author Daniel
 * @version 10/03/2024
 */
public class RepeatedNTimesNumber {

  public static void main(String[] args) {
    System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
  }

  public static int repeatedNTimes(int[] nums) {
    int repeatedTimes = nums.length / 2;
    HashMap<Integer, Integer> hashMap =  new HashMap<>();

    for (int num : nums) {
      if (hashMap.containsKey(num)) {
        if (hashMap.get(num) + 1 == repeatedTimes) return num;
        hashMap.put(num, hashMap.get(num + 1));
      } else {
        hashMap.put(num, 1);
      }
    }
    return 0;
  }
}
