package challenges;

import java.util.ArrayList;

/**
 * @author Daniel
 * @Date 07/03/2023
 */

public class PowerSum {


    public static int powerSum(ArrayList<Object> initialArray, int pow) {
        int finalValue = initialArray.stream()
                .mapToInt(o -> o instanceof  Integer ? (int) o : powerSum((ArrayList<Object>) o, pow + 1))
                .sum();
        return (int) Math.pow(finalValue, pow);
    }
}
