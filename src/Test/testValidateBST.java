package Test;

import DFS.Tree.TreeNode;
import DFS.Tree.ValidateBST;

public class testValidateBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(4);
        TreeNode root2 = new TreeNode(1);
        root.left = root1;
        root1.left = root2;

        ValidateBST vb = new ValidateBST();
        System.out.println(vb.isBalanced(root));

    }
}
