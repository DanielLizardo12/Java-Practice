package test;

import challenges.PowerSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Daniel
 * @Date 05/04/2023
 */

class PowerSumTest {

    @Test
    public void testPowerSumNoInnerArray() {
        ArrayList<Object> arrayListFirstCase = new ArrayList<>();
        arrayListFirstCase.add(1);
        arrayListFirstCase.add(2);
        arrayListFirstCase.add(3);

        Assertions.assertEquals(6, PowerSum.powerSum(arrayListFirstCase, 1));
    }

    @Test
    public void testPowerSumInnerArray() {
        ArrayList<Object> arrayListSecondCase = new ArrayList<>();
        ArrayList<Object> nestedArrayListSecondCase = new ArrayList<>();
        arrayListSecondCase.add(1);
        arrayListSecondCase.add(2);
        nestedArrayListSecondCase.add(3);
        arrayListSecondCase.add(nestedArrayListSecondCase);

        Assertions.assertEquals(12, PowerSum.powerSum(arrayListSecondCase, 1));
    }

    @Test
    public void testPowerSumComplexInnerArray() {
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

        Assertions.assertEquals(116, PowerSum.powerSum(arrayListThirdCase, 1));
    }

}