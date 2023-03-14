package challenges;

/**
 * @author Daniel
 * @Date 14/03/2023
 */
public class FirstNonRepeatingCharacter {
    public static Integer firstNonRepeatingCharacter(String string){
        for (int i = 0; i < string.length(); i++) {
            int counter = 0;
            for (int j = 0; j < string.length(); j++) {
                if ((string.charAt(i) == string.charAt(j)) && (i != j)) {
                    counter++;
                    System.out.println(i + " "  + j);
                }
            }
            if (counter == 0) return i;
        }
        return null;
    }
}
