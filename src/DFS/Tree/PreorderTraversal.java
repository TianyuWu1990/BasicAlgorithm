package DFS.Tree;


import java.util.ArrayList;

public class PreorderTraversal {
    // 将根作为root，空ArrayList作为result传入，即可得到整棵树的遍历结果
    private void traverse(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}
