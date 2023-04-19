package challenges;

/**
 * @author Daniel
 * @Date 19/04/2023
 */

public class SymmetricTree {

    public static boolean isSymmetric(SameTree.TreeNode root) {
        if (root == null) return true;

        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(SameTree.TreeNode left, SameTree.TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return left.val == right.val
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}
