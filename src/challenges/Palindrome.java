package challenges;

/**
 * @author Daniel
 * @Date 14/03/2023
 */
public class Palindrome {

    public static boolean palindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i <= j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
