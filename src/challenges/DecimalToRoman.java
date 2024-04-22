package challenges;

/**
 * DecimalToRoman description.
 *
 * @author Daniel
 * @version 18/04/2024
 */
public class DecimalToRoman {

  // Define arrays for Roman numeral symbols and their corresponding decimal values
  private static final String[] ROMAN_SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
  private static final int[] DECIMAL_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

  // Function to convert decimal to Roman numerals
  public static String decimalToRoman(int number) {
    if (number < 1 || number > 3000) {
      throw new IllegalArgumentException("Input number must be in the range from 1 to 3000");
    }

    StringBuilder romanNumeral = new StringBuilder();

    // Iterate through each symbol and its corresponding decimal value
    for (int i = 0; i < DECIMAL_VALUES.length; i++) {
      // Repeat the symbol until the number is greater than or equal to its decimal value
      while (number >= DECIMAL_VALUES[i]) {
        romanNumeral.append(ROMAN_SYMBOLS[i]); // Append the symbol to the result
        number -= DECIMAL_VALUES[i]; // Subtract the decimal value from the number
      }
    }

    return romanNumeral.toString();
  }

  public static void main(String[] args) {
    int decimalNumber = 564; // Example decimal number
    System.out.println("Roman numeral for " + decimalNumber + " is: " + decimalToRoman(decimalNumber));
  }
}
