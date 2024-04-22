package challenges;

/**
 * Compress description.
 *
 * @author Daniel
 * @version 16/04/2024
 */
public class Compress {

  public static void main(String[] args) {
    System.out.println(compress(new String[]{"a","b","b","b","b","b","b","b","b","b","b","b","b"}));
  }

  private static String compress(String[] strings) {

    StringBuilder stringBuilder = new StringBuilder();
    int counter = 1;
    String currentLetter = strings[0];

    for (int i = 1; i < strings.length; i++) {
      if (strings[i].equals(currentLetter)) {
        counter++;
      } else {
        stringBuilder.append(currentLetter).append(counter > 1 ? String.valueOf(counter) : "");
        counter = 1;
        currentLetter = strings[i];
      }
    }
    stringBuilder.append(currentLetter).append(counter > 1 ? String.valueOf(counter) : "");

    return stringBuilder.toString();
  }

}
