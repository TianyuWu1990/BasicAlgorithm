package DFS.Tree;

import java.util.ArrayList;

public class PostorderTraversal {
    private void traverse(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        traverse(root.left, result);
        traverse(root.right, result);
        result.add(root.val);  // 注意访问根节点放到了最后
    }
}
