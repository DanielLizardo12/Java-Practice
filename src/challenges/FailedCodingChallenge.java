package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FailedCodingChallenge description.
 *
 * @author Daniel
 * @version 13/03/2024
 */
class FailedCodingChallenge {
  public String maximiser(String input1, int input2) {
    char[] numArray = input1.toCharArray();
    int swaps = 0;

    for (int i = 0; i < numArray.length - 1 && swaps < input2; i++) {
      int maxIndex = i;
      for (int j = i + 1; j < numArray.length; j++) {
        if (numArray[j] > numArray[maxIndex]) {
          maxIndex = j;
        }
      }

      if (maxIndex != i) {
        char temp = numArray[maxIndex];
        for (int k = maxIndex; k > i; k--) {
          numArray[k] = numArray[k - 1];
          swaps++;
        }
        numArray[i] = temp;
      }
    }

    return new String(numArray);
  }

  public static void main(String[] args) {
    // Test cases
    FailedCodingChallenge userMainCode = new FailedCodingChallenge();

    // Test case format: input1, input2, expectedOutput
    String[][] testCases = {
        {"33333333333333333333333333333333333333333", "33", "33333333333333333333333333333333333333333"},
        {"87655555555", "22", "87655555555"},
        {"1821984761920479113476719828", "16", "9982181476120479113476719828"},
        {"16348716248917", "13", "96314871624817"},
        {"354851", "5", "854351"},
        {"68980", "5", "98860"},
        {"72204", "3", "74220"},
        {"60897", "3", "96087"},
        {"60465480895120754010565564654654875", "3", "96650448085120754010565564654654875"},
        {"6453467465129873219945677321321313486529974", "23", "9766543446512873219945677321321313486529974"}
    };

    System.out.println("TEST CASE\t\tEXPECTED OUTPUT\t\tACTUAL OUTPUT\t\tERROR MESSAGE");
    System.out.println("-----------------------------------------------------------------------------------------------");

    for (int i = 0; i < testCases.length; i++) {
      String input1 = testCases[i][0];
      int input2 = Integer.parseInt(testCases[i][1]);
      String expectedOutput = testCases[i][2];

      String output = userMainCode.maximiser(input1, input2);

      if (output.equals(expectedOutput)) {
        System.out.println("Test Case " + (i + 1) + "\t\t" + expectedOutput + "\t\t\t" + output + "\t\t\t" + "NA");
      } else {
        System.out.println("Test Case " + (i + 1) + "\t\t" + expectedOutput + "\t\t\t" + output + "\t\t\t" + "Error");
      }
    }
  }
}