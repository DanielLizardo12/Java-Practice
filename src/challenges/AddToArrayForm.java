package challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @Date 11/04/2023
 */

public class AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> integerList = new ArrayList<>();
        StringBuilder arrayToInt = new StringBuilder();

        for (int j : num) {
            arrayToInt.append(j);
        }

        StringBuilder summedArrayAndInt =
                new StringBuilder(String.valueOf(Integer.parseInt(String.valueOf(arrayToInt)) + k));

        for (int i = 0; i < summedArrayAndInt.length(); i++) {
            integerList.add(Integer.parseInt(String.valueOf(summedArrayAndInt.charAt(i))));
        }

        return integerList;
    }

}
