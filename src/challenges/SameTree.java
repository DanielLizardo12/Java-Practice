package challenges;

/**
 * @author Daniel
 * @Date 31/03/2023
 */

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return true;
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
