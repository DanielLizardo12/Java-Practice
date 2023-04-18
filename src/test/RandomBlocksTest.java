package test;

import challenges.RandomBlocks;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Daniel
 * @Date 17/04/2023
 */

class RandomBlocksTest {

    @Test
    public void testRandomBlockLarge() {
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(3)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(3)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(3)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(3)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(3)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(3)));
    }

    @Test
    public void testRandomBlockSmall() {
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(2)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(2)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(2)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(2)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(2)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(2)));
        System.out.println(Arrays.toString(RandomBlocks.generateRandomBlocks(2)));
    }

}