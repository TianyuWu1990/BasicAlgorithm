package DFS.Tree;

public class MaxDepth {
    public int maxdepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxdepth(root.left);
        int right = maxdepth(root.right);
        return Math.max(left, right) + 1;
    }
}
