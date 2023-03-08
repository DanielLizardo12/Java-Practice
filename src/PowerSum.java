import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * @author Daniel
 * @Date 07/03/2023
 */

public class PowerSum {

    public static void main(String[] args) {
        String formatString = "Array: %s Solution: %s";
        ArrayList<Object> arrayListFirstCase = new ArrayList<>();
        arrayListFirstCase.add(1);
        arrayListFirstCase.add(2);
        arrayListFirstCase.add(3);
        System.out.printf((formatString) + "%n", arrayListFirstCase, powerSum(arrayListFirstCase, 1));

        ArrayList<Object> arrayListSecondCase = new ArrayList<>();
        ArrayList<Object> nestedArrayListSecondCase = new ArrayList<>();
        arrayListSecondCase.add(1);
        arrayListSecondCase.add(2);
        nestedArrayListSecondCase.add(3);
        arrayListSecondCase.add(nestedArrayListSecondCase);
        System.out.printf((formatString) + "%n", arrayListSecondCase, powerSum(arrayListSecondCase, 1));

        ArrayList<Object> arrayListThirdCase = new ArrayList<>();
        ArrayList<Object> nestedArrayListThirdCase = new ArrayList<>();
        ArrayList<Object> nested1ArrayListThirdCase = new ArrayList<>();
        ArrayList<Object> nestedNestedArrayListThirdCase = new ArrayList<>();
        arrayListThirdCase.add(1);
        arrayListThirdCase.add(2);
        nestedArrayListThirdCase.add(3);
        nestedArrayListThirdCase.add(4);
        nestedNestedArrayListThirdCase.add(2);
        arrayListThirdCase.add(nestedArrayListThirdCase);
        arrayListThirdCase.add(nested1ArrayListThirdCase);
        nested1ArrayListThirdCase.add(nestedNestedArrayListThirdCase);

        System.out.printf((formatString) + "%n", arrayListThirdCase, powerSum(arrayListThirdCase, 1));
    }

    public static int powerSum(ArrayList<Object> initialArray, int pow) {
        int finalValue = 0;

        for (Object o : initialArray) {
            if (o instanceof Integer) {
                finalValue = finalValue + (int) o;
            } else {
                finalValue = finalValue + powerSum((ArrayList<Object>) o, pow + 1);
            }
        }
        return (int) Math.pow(finalValue, pow);
    }
}
