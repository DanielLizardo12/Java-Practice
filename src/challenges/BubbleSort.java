package challenges;

/**
 * @author Daniel
 * @Date 20/03/2023
 */

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {

        int temp;

         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j] && i != j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

}
