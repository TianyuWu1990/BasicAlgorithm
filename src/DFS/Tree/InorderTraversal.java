package DFS.Tree;

import java.util.ArrayList;

public class InorderTraversal {
    private void traverse(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        traverse(root.left, result);
        result.add(root.val);  // 注意访问根节点放到了遍历左子树的后面
        traverse(root.right, result);
    }
}
