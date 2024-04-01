package challenges;

/**
 * FindTheHighestAltitude description.
 *
 * @author Daniel
 * @version 01/04/2024
 */
public class FindTheHighestAltitude {

  public static void main(String[] args) {
    System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
  }

  private static int largestAltitude(int[] gain) {
    int altitude = 0;
    int maxAltitude = 0;

    for (int j : gain) {
      altitude += j;
      maxAltitude = Math.max(maxAltitude, altitude);
    }

    return maxAltitude;
  }

}
