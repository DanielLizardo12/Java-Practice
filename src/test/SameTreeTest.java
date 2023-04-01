package test;

import challenges.SameTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 31/03/2023
 */

class SameTreeTest {

    @Test
    public void testSameTree() {
        SameTree.TreeNode p = new SameTree.TreeNode(1, null, null);
        SameTree.TreeNode q = new SameTree.TreeNode(1, null, null);

        Assertions.assertTrue(SameTree.isSameTree(p, q));
    }

}