package challenges;

/**
 * @author Daniel
 * @Date 22/04/2023
 */

public class MakeFancyString {

    public static String makeFancyString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                char temp = s.charAt(i);
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) != temp) {
                        if ((j - 1) - i >= 2) {
                            s = s.substring(0, i) + s.substring(i, i + 2) + s.substring(j);
                            System.out.println(s);
                        }
                        i = j;
                        break;
                    }
                }
            }
        }
        return s;
    }

}
