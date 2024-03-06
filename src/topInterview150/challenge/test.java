package topInterview150.challenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * test description.
 *
 * @author Daniel
 * @version 25/02/2024
 */
public class test {

  public static void main(String[] args) {

    String string = "           YES      leading spaces        are valid,    problemsetters are         evillllll";

    String token = "";
    int tokenCounter = 0;
    ArrayList<String> tokenList =  new ArrayList<>();

    for (int i = 0; i < string.length(); i++) {
      if (string.substring(i, i+ 1).matches("[a-zA-Z]")) {
        token += string.charAt(i);
      } else {
        if (token.length() > 0) {
          tokenCounter++;
          tokenList.add(token);
          token = "";
        }
      }
    }

    if (token.length() > 0) {
      tokenCounter++;
      tokenList.add(token);
    }

    System.out.println(tokenCounter);
    tokenList.forEach(System.out::println);

    //System.out.println("v".matches("[a-zA-Z]"));
  }

  static boolean isAnagram(String a, String b) {
    // Complete the function

    if (a.length() != b.length()) return false;

    ArrayList<Integer> banned = new ArrayList<>();

    a = a.toLowerCase();
    b = b.toLowerCase();

    for (int i = 0; i < a.length(); i++) {
      for (int j = 0; j < b.length(); j++) {
        if (!banned.contains(j)) {
          if (a.charAt(i) == b.charAt(j)) {
            banned.add(j);
            break;
          }
        }
      }
    }

    return banned.size() == a.length();
  }

}
