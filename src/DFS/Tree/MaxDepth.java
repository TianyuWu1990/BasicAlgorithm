package DFS.Tree;

public class MaxDepth {

    //divide and conquer
    public int maxdepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxdepth(root.left);
        int right = maxdepth(root.right);
        return Math.max(left, right) + 1;
    }

    //traversal recursion

    private int max;
    public int maxdepth2(TreeNode root) {
        max = 0;
        recursion(root, 1);
        return max;
    }

    private void recursion(TreeNode root, int curDepth) {
        if (root == null) {
            return;
        }

        max = Math.max(max, curDepth);
        recursion(root.left, curDepth + 1);
        recursion(root.right, curDepth + 1);
    }
}
