package challenges;

import java.util.Arrays;

/**
 * ProductOfArrayExceptSelf description.
 *
 * @author Daniel
 * @version 26/03/2024
 */
public class ProductOfArrayExceptSelf {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(productExceptSelfInitialApproach(new int[]{1,2,3,4})));
  }

  private static int[] productExceptSelfInitialApproach(int[] nums) {
    final int arrayLength = nums.length;
    int[] productArray =  new int[arrayLength];

    for (int i = 0; i < arrayLength; i++) {
      if (i == 0) {
        productArray[0] = calculateProductOfInnerArray(nums, 1, arrayLength);
      } else if (i == arrayLength - 1) {
        productArray[arrayLength - 1] = calculateProductOfInnerArray(nums, 0, arrayLength - 1);
      } else {
        productArray[i] = calculateProductOfInnerArray(nums, 0, i)
            * calculateProductOfInnerArray(nums, i + 1, arrayLength);
      }
    }
    return productArray;
  }

  private static int calculateProductOfInnerArray(int[] nums, int firstIndex, int lastIndex) {
    int product = 1;
    for (int i = firstIndex; i < lastIndex; i++) {
      product = product * nums[i];
    }

    return product;
  }

}
