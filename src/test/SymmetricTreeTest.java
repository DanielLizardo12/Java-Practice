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

    @Test
    public void testSymmetricTreeWithNullRoot() {
        SameTree.TreeNode treeNode = null;
        Assertions.assertTrue(SymmetricTree.isSymmetric(treeNode));
    }

    @Test
    public void testSymmetricTreeWithSingleNode() {
        SameTree.TreeNode treeNode = new SameTree.TreeNode(1);
        Assertions.assertTrue(SymmetricTree.isSymmetric(treeNode));
    }

    @Test
    public void testSymmetricTreeWithTwoNodes() {
        SameTree.TreeNode treeNodeLeft = new SameTree.TreeNode(2);
        SameTree.TreeNode treeNodeRight = new SameTree.TreeNode(2);
        SameTree.TreeNode treeNode = new SameTree.TreeNode(1, treeNodeLeft, treeNodeRight);

        Assertions.assertTrue(SymmetricTree.isSymmetric(treeNode));
    }

    @Test
    public void testSymmetricTreeWithOddNumberOfNodes() {
        SameTree.TreeNode treeNodeThree = new SameTree.TreeNode(3);
        SameTree.TreeNode treeNodeFour = new SameTree.TreeNode(4);
        SameTree.TreeNode treeNodeFive = new SameTree.TreeNode(5);
        SameTree.TreeNode treeNodeTwoLeft = new SameTree.TreeNode(2, treeNodeFour, treeNodeThree);
        SameTree.TreeNode treeNodeTwoRight = new SameTree.TreeNode(2, treeNodeThree, treeNodeFive);
        SameTree.TreeNode treeNodeOne = new SameTree.TreeNode(1, treeNodeTwoLeft, treeNodeTwoRight);

        Assertions.assertFalse(SymmetricTree.isSymmetric(treeNodeOne));
    }

    @Test
    public void testSymmetricTreeWithUnsymmetricNodes() {
        SameTree.TreeNode treeNodeThree = new SameTree.TreeNode(3);
        SameTree.TreeNode treeNodeFour = new SameTree.TreeNode(4);
        SameTree.TreeNode treeNodeFive = new SameTree.TreeNode(5);
        SameTree.TreeNode treeNodeTwoLeft = new SameTree.TreeNode(2, treeNodeThree, treeNodeFive);
        SameTree.TreeNode treeNodeTwoRight = new SameTree.TreeNode(2, treeNodeFour, null);
        SameTree.TreeNode treeNodeOne = new SameTree.TreeNode(1, treeNodeTwoLeft, treeNodeTwoRight);

        Assertions.assertFalse(SymmetricTree.isSymmetric(treeNodeOne));
    }

}