package topInterview150.challenge;

/**
 * Braces description.
 *
 * @author Daniel
 * @version 25/02/2024
 */
public class Braces {

  static String isBalanced(String s) {

    if (s.equals("")) return "true";

      if(s.charAt(0) == '(') {
        int otherOpeningBrackets = 0;

        for (int i = 1; i < s.length(); i++) {
          if(s.charAt(i) == '(') {
            otherOpeningBrackets++;
          }

          if(s.charAt(i) == ')' && otherOpeningBrackets > 0) {
            otherOpeningBrackets--;
          }

          if(s.charAt(i) == ')' && otherOpeningBrackets == 0) {
            String beforeLastClosing = s.substring(1, i);
            String afterLastClosing = s.substring(i + 1);
            if ((beforeLastClosing + afterLastClosing).equals("")) return "true";
            if (s.equals("")) return "true";
            isBalanced(s);
          }
        }
      }

      if(s.charAt(0) == '{') {
        int otherOpeningBrackets = 0;

        for (int i = 1; i < s.length(); i++) {
          if(s.charAt(i) == '{') {
            otherOpeningBrackets++;
          }



          if(s.charAt(i) == '}' && otherOpeningBrackets > 0) {
            otherOpeningBrackets--;
          }

          if(s.charAt(i) == '}' && otherOpeningBrackets == 0) {
            String beforeLastClosing = s.substring(1, i);
            String afterLastClosing = s.substring(i + 1);
            s = beforeLastClosing + afterLastClosing;
            if ((beforeLastClosing + afterLastClosing).equals("")) return "true";
            isBalanced(s);
          }
        }
      }
      return "false";
  }

  public static void main(String[] args) {
    System.out.println(isBalanced("{}()"));
  }

}
