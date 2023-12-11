package challenges;

import java.util.HashMap;

/**
 * PathCrossing description.
 *
 * @author Daniel
 * @version 11/12/2023
 */
public class PathCrossing {

  public static void main(String[] args) {
    System.out.println(isPathCrossing("NESWW"));
  }

  public static boolean isPathCrossing(String path) {
    HashMap<String, Integer> locations = new HashMap<>();
    locations.put("0,0", -1);
    int currentX = 0;
    int currentY = 0;

    for (int i = 0; i < path.length(); i++) {
      switch (path.charAt(i)) {
        case 'N':
          currentY++;
          break;
        case 'S':
          currentY--;
          break;
        case 'E':
          currentX++;
          break;
        case 'W':
          currentX--;
          break;
      }
      if (locations.containsKey(currentX + "," + currentY)) {
        return true;
      }

      locations.put(currentX + "," + currentY, i);
    }

    return false;
  }

}
