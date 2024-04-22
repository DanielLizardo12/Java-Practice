package challenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * FlatMapTest description.
 *
 * @author Daniel
 * @version 19/04/2024
 */
public class FlatMapTest {

  public static void main(String[] args) {
    List<List<Integer>> lists =  new ArrayList<>();

    lists.add(List.of(1,2));
    lists.add(List.of(1,3,4,2));
    lists.add(List.of(5,6,6,7));

    Set<Integer> manualSet = new HashSet<>();

    lists.forEach(manualSet::addAll);


    Set<Integer> mappedList = lists.stream()
        .flatMap(Collection::stream)
        .map(number -> number + 1)
        .filter(number -> number % 2 == 0)
        .filter(number -> number > 5)
        .collect(Collectors.toSet())
        .stream()
        .filter(number -> number == 8)
        .collect(Collectors.toSet());


    System.out.println(mappedList);
    //System.out.println(manualSet);
  }

}
