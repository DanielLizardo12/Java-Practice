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
    System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
  }

  private static int[] productExceptSelf(int[] nums) {

    int productOfEntireArray = 1;

    for (int num : nums) {
      productOfEntireArray = productOfEntireArray * num;
    }

    for (int i = 0; i < nums.length; i++) {
      nums[i] = productOfEntireArray / nums[i];
    }

    return nums;
  }

}
