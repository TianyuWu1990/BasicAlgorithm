package Test;

import DFS.Tree.MaxDepth;
import DFS.Tree.TreeNode;

public class testMaxDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        root.left = root1;
        root1.left = root2;

        MaxDepth md = new MaxDepth();
        System.out.println(md.maxdepth(root) == md.maxdepth2(root));
        System.out.println(md.maxdepth(root));

    }
}
