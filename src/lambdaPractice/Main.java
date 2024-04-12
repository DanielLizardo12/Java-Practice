package lambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    Executor executor1 = (strings) -> {
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
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);
  }

}
