package topInterview150.challenge;

/**
 * MaxOddBinary description.
 *
 * @author Daniel
 * @version 10/03/2024
 */
public class MaxOddBinary {

  public static void main(String[] args) {
    System.out.println(maximumOddBinaryNumber("1001"));
  }

  private static String maximumOddBinaryNumber(String s) {
    int initial1Count = 0;
    StringBuilder maxBinaryBuilder = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        initial1Count++;
      }
    }

    for (int i = 0; i < initial1Count; i++) {
      maxBinaryBuilder.append("1");
    }

    int initial0Count = s.length() - initial1Count;

    for (int i = 0; i < initial0Count; i++) {
      maxBinaryBuilder.append("0");
    }

    String maxBinary = maxBinaryBuilder.toString();

    if (binaryToInt(maxBinary) % 2 == 0) {
      return maxOddBinary(maxBinary);
    } else {
      return maxBinary;
    }
  }

  private static String maxOddBinary(String binaryString) {
    int last1Index = binaryString.lastIndexOf('1');

    String nextMaxBinary = binaryString.substring(0, last1Index) + "01"
        + binaryString.substring(last1Index + 2);

    if (binaryToInt(nextMaxBinary) % 2 == 0){
      return maxOddBinary(nextMaxBinary);
    }

    return nextMaxBinary;
  }


  private static int binaryToInt(String binaryString) {
    return Integer.parseInt(binaryString, 2);
  }

}
