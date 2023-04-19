package test;

import challenges.SameTree;
import challenges.SymmetricTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 19/04/2023
 */

class SymmetricTreeTest {

    @Test
    public void testSymmetricTree() {
        SameTree.TreeNode treeNodeFour = new SameTree.TreeNode(4);
        SameTree.TreeNode treeNodeThree = new SameTree.TreeNode(3);
        SameTree.TreeNode treeNodeTwoLeft = new SameTree.TreeNode(2, treeNodeThree, treeNodeFour);
        SameTree.TreeNode treeNodeTwoRight = new SameTree.TreeNode(2, treeNodeFour, treeNodeThree);
        SameTree.TreeNode treeNode = new SameTree.TreeNode(1, treeNodeTwoLeft, treeNodeTwoRight);

        Assertions.assertTrue(SymmetricTree.isSymmetric(treeNode));
    }

}