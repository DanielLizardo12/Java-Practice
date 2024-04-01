package challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * UniqueNumberOfOccurrences description.
 *
 * @author Daniel
 * @version 01/04/2024
 */
public class UniqueNumberOfOccurrences {

  public static void main(String[] args) {
    System.out.println(uniqueOccurrences(new int[]{1,2}));
  }

  private static boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> seen = new HashMap<>();

    for (int j : arr) seen.put(j, seen.getOrDefault(j, 0) + 1);

    HashSet<Integer> seenValues = new HashSet<>(seen.values());
    
    return seen.size() == seenValues.size();
  }
}
