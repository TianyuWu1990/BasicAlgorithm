package BFS;

import DFS.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversalBST {
    public List<List<Integer>> zigzag(TreeNode root) {
        // write your code here
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> myQue = new LinkedList<TreeNode>();
        myQue.offer(root);
        boolean zig = true;
        while (!myQue.isEmpty()) {
            LinkedList<Integer> level = new LinkedList<>();
            int size = myQue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = myQue.poll();
                level.add(head.val);
                if (!zig) {
                    if (head.left != null) {
                        myQue.offer(head.left);
                    }
                    if (head.right != null) {
                        myQue.add(head.right);
                    }
                    zig = !zig;
                }else{
                    if (head.right != null) {
                        myQue.offer(head.right);
                    }
                    if (head.left != null) {
                        myQue.add(head.left);
                    }
                    zig = !zig;
                }
            }
            res.add(level);
        }
        return res;
    }
}
