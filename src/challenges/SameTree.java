package challenges;

/**
 * @author Daniel
 * @Date 31/03/2023
 */

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // if both are null it's the end of the tree
        if (p == null && q == null) return true;

        // if only one is null, then there not the same
        if (p == null || q == null) return false;

        // if p and q values are not equal then there not the same tree
        if (p.val != q.val) return false;

        // recursively call isSameTree for left and right trees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode() {}
        TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
