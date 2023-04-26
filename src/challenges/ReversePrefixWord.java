package challenges;

/**
 * @author Daniel
 * @Date 26/04/2023
 */

public class ReversePrefixWord {

    public static String reversePrefix(String word, char ch) {
        StringBuilder toReverse = new StringBuilder();
        String remaining = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                toReverse = new StringBuilder(word.substring(0, i + 1));
                remaining = word.substring(i + 1);
                break;
            }
        }

        return toReverse.length() > 0 ? toReverse.reverse() + remaining : word;
    }

    public String reversePrefixFaster(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder sb = new StringBuilder(word.substring(0, index+1));
        sb.reverse();
        return sb.toString().concat(word.substring(index+1));
    }

}
