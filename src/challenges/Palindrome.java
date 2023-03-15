package challenges;

/**
 * @author Daniel
 * @Date 14/03/2023
 */
public class Palindrome {

    public static boolean palindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        }
        return true;
    }
}
