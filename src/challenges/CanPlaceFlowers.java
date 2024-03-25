package challenges;

/**
 * CanPlaceFlowers description.
 *
 * @author Daniel
 * @version 25/03/2024
 */
public class CanPlaceFlowers {

  public static void main(String[] args) {
    System.out.println(canPlaceFlowers(new int[]{0,1,0}, 1));
  }

  public static boolean canPlaceFlowers(int[] flowerBed, int n) {
    int counter = 0;

    if (n == 0) return true;

    if (flowerBed.length == 1) {
      return flowerBed[0] == 0;
    }

    for (int i = 0; i < flowerBed.length; i++) {

      if (flowerBed[i] == 0) {
        if (i == 0 && flowerBed[i + 1] == 0) {
          flowerBed[i] = 1;
          counter++;
        }
        if (i == flowerBed.length - 1 && flowerBed[i - 1] == 0) {
          counter++;
        }
        if (i != 0 && i != flowerBed.length - 1) {
          if (flowerBed.length > i + 1 && flowerBed[i - 1] == 0 && flowerBed[i + 1] == 0) {
            flowerBed[i] = 1;
            counter++;
          }
        }
        if (counter == n) return true;
      }
    }
    return false;
  }

}
