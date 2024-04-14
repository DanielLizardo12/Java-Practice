package lambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Main description.
 *
 * @author Daniel
 * @version 09/04/2024
 */
public class Main {

  public static void main(String[] args) {

    List<String> stringList =  new ArrayList<>();

    stringList.add("string");
    stringList.add("wd");

    Executor executor = new Executor() {
      @Override
      public void execute(List<String> strings) {
        for (String string: strings) {
          if (string.equals("string")) {
            System.out.println(string);
          }
        }
      }
    };

    Executor executor1 = strings -> {
      for (String string: strings) {
        if (string.equals("wd")) {
          System.out.println(string);
        }
      }
    };

    executor.execute(stringList);
    executor1.execute(stringList);
    Executor.printList(stringList);
    Executor.printList1(stringList);
    executor1.printListDefault(stringList);
    executor1.printListDefault1(stringList);

    int[] numbers = new int[]{1,1,2,2,2,2,2,3,4,4,4,4,5,6,7,8,9,10};

    Arrays.stream(numbers)
        .boxed()
        .collect(Collectors.toSet())
        .stream()
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);

    Cat cat1 = new Cat(1,"JimmyMcgill");
    Cat cat2 = new Cat(2,"KimWexler");
    Cat cat3 = new Cat(1,"JimmyMcgill");
    Cat cat4 = new Cat(2,"KimWexler");


    List<Cat> cats = new ArrayList<>();
    cats.add(cat1);
    cats.add(cat2);
    cats.add(cat3);
    cats.add(cat4);

    HashMap<Integer, Cat> catHashMap = new HashMap<>();

    for (Cat cat : cats) {
      catHashMap.put(cat.getId(), cat);
    }

    List<Cat> uniqueCats = new ArrayList<>(catHashMap.values());

    //System.out.println(catHashMap.values());
    System.out.println(uniqueCats);
  }

}
