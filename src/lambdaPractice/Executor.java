package lambdaPractice;

import java.util.List;

/**
 * Executor description.
 *
 * @author Daniel
 * @version 09/04/2024
 */
@FunctionalInterface
public interface Executor {
  void execute(List<String> stringList);

  default void printListDefault(List<String> stringList) {
    System.out.println(stringList);
  };

   default void printListDefault1(List<String> stringList) {
    System.out.println(stringList);
  }

   static void printList(List<String> stringList) {
    System.out.println(stringList);
  }

  static void printList1(List<String> stringList) {
    executePrivate(stringList);
  }

  private static void executePrivate(List<String> stringList) {
    System.out.println(stringList);
  }
}
