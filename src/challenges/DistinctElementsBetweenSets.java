package challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * DistinctElementsBetweenSets description.
 *
 * @author Daniel
 * @version 15/04/2024
 */
public class DistinctElementsBetweenSets {

  public static void main(String[] args) {
    Set<Integer> a = Set.of(1,2,3,4,5, 9, 10, 11);
    Set<Integer> b = Set.of(1,2,4,5,6,7,8);

    System.out.println(uniqueElementsInA(a, b));
  }

  private static Set<Integer> uniqueElementsInA(Set<Integer> a, Set<Integer> b) {

    return a.stream().filter(element -> !b.contains(element)).collect(Collectors.toSet());
  }

}
