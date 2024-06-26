package challenges;

/**
 * ContainerWithMostWater description.
 *
 * @author Daniel
 * @version 31/03/2024
 */
public class ContainerWithMostWater {

  public static void main(String[] args) {
    System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
  }

  private static int maxArea(int[] height) {
    int maxHeight = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      maxHeight = Math.max(maxHeight, (Math.min(height[left], height[right]) * (right - left)));

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }

    return maxHeight;
  }

}
