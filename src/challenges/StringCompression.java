package challenges;

/**
 * StringCompression description.
 *
 * @author Daniel
 * @version 29/03/2024
 */
public class StringCompression {

  public static void main(String[] args) {
    System.out.println(compress(new char[]{'a','b','c'}));
  }

  private static int compress(char[] chars) {

    if (chars.length == 1) return 1;

    StringBuilder stringBuilder = new StringBuilder();
    char currentCharacter = chars[0];
    int sequenceStartedInIndex = 1;

    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == currentCharacter) {
        sequenceStartedInIndex++;
      } else {
       stringBuilder.append(currentCharacter);

       if (sequenceStartedInIndex > 1) {
         stringBuilder.append(sequenceStartedInIndex);
       }

       sequenceStartedInIndex = 1;
       currentCharacter = chars[i];
      }
    }
    stringBuilder.append(currentCharacter);

    if (sequenceStartedInIndex > 1) stringBuilder.append(sequenceStartedInIndex);

    for (int i = 0; i < stringBuilder.length(); i++) {
      chars[i] = stringBuilder.charAt(i);
    }
    return stringBuilder.length();
  }

}
