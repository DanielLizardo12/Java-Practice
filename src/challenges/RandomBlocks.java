package challenges;

import java.util.Random;

/**
 * @author Daniel
 * @Date 17/04/2023
 */

public class RandomBlocks {

    public static int[] generateRandomBlocks(int blocks) {

        Random random = new Random();

        if (blocks == 3) {
            return new int[]{random.nextInt(3), random.nextInt(3), random.nextInt(3)};
        } else if (blocks == 2) {
            return new int[]{random.nextInt(3), random.nextInt(3)};
        }

        return new int[]{};
    }

}
