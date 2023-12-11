package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * main description.
 *
 * @author Daniel
 * @version 09/11/2023
 */
public class Main {

  public static void main(String[] args) {
    String email = "dan@gmail.com";
    String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    System.out.println(Pattern.compile(regexPattern).matcher(email).matches());

  }
}
