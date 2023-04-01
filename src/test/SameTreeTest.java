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
    public void testSameTreeEqualTrees() {
        SameTree.TreeNode p = new SameTree.TreeNode(1, null, null);
        SameTree.TreeNode q = new SameTree.TreeNode(1, null, null);

        Assertions.assertTrue(SameTree.isSameTree(p, q));
    }

    @Test
    public void testSameTreeBigTree() {
        SameTree.TreeNode tree = new SameTree.TreeNode(20, null, null);
        SameTree.TreeNode tree2 = new SameTree.TreeNode(20, null, null);
        SameTree.TreeNode p = new SameTree.TreeNode(1, tree, tree2);
        SameTree.TreeNode q = new SameTree.TreeNode(1, tree, tree2);

        Assertions.assertTrue(SameTree.isSameTree(p, q));
    }

    @Test
    public void testSameTreeDifferentVal() {
        SameTree.TreeNode p = new SameTree.TreeNode(1, null, null);
        SameTree.TreeNode q = new SameTree.TreeNode(1, p, p);

        Assertions.assertFalse(SameTree.isSameTree(p, q));
    }

}