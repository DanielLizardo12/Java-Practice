package challenges;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * HashTableTest description.
 *
 * @author Daniel
 * @version 12/03/2024
 */
public class HashTableTest {

  public static void main(String[] args) {
    HashMap<Integer, String> table1 = new HashMap<>(16);

    table1.put(100, "Spongebob");
    table1.put(123, "Patrick");
    table1.put(321, "Sandy");
    table1.put(555, "Squidward");
    table1.put(777, "Gary");

    for (Integer key : table1.keySet()) {
      System.out.println(key.hashCode() % 16 + " " + key + " " + table1.get(key));
    }

  }

}
