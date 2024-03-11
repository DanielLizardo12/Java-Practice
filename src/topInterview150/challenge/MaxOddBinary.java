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
    String maxBinary = "";

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        initial1Count++;
      }
    }

    for (int i = 0; i < initial1Count; i++) {
      maxBinary += "1";
    }

    int initial0Count = s.length() - initial1Count;

    for (int i = 0; i < initial0Count; i++) {
      maxBinary += "0";
    }

    if (binaryToInt(maxBinary) % 2 == 0) {
      return maxOddBinary(maxBinary);
    } else {
      return maxBinary;
    }
  }

  private static String maxOddBinary(String string) {
    String nextMaxBinary = "";
    for (int i = string.length() - 2; i >= 0; i--) {
      if (string.charAt(i) == '1') {
        nextMaxBinary = string.substring(0, i) + "01" + string.substring(i + 2);
        break;
      }
    }
    if (binaryToInt(nextMaxBinary) % 2 == 0) {
      return maxOddBinary(nextMaxBinary);
    }
    return nextMaxBinary;
  }


  private static int binaryToInt(String string) {
    int currentIntBinaryValue = 1;
    int number = 0;
    for (int i = string.length() - 1; i >= 0; i--) {
      if (string.charAt(i) == '1') {
        number += currentIntBinaryValue;
      }
      currentIntBinaryValue = currentIntBinaryValue * 2;
    }
    return number;
  }

}
