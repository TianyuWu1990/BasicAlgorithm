package BFS;

import DFS.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalBST {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> myQue = new LinkedList<TreeNode>();
        myQue.offer(root);
        while (!myQue.isEmpty()) {
            LinkedList<Integer> level = new LinkedList<>();
            int size = myQue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = myQue.poll();
                level.add(head.val);
                if (head.left != null) {
                    myQue.offer(head.left);
                }
                if (head.right != null) {
                    myQue.add(head.right);
                }

            }
            res.add(level);
        }
        return res;
    }
}
