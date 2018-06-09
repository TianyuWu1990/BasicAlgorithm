package DFS.Tree;

import CtCILibrary.TreeNode;

public class ClosestBSTvalue {

    int ans = Integer.MAX_VALUE;

    public int closestValue(TreeNode root, double target) {
        // write your code here
        if (root == null) {
            return -1;
        }
        helper(root, target);
        return ans;
    }
    private void helper(TreeNode root, double target){
        if (root == null) {
            return;
        }
        helper(root.left, target);
        int cur_ans = root.data;
        if(Math.abs(target - cur_ans) < Math.abs(target - ans)) {
            ans = cur_ans;
        }
        helper(root.right, target);


    }
//    public static int closestdataue(TreeNode root, double target) {
//        if (root == null) {
//            return 0;
//        }
//
//        TreeNode lowerNode = lowerBound(root, target);
//        TreeNode upperNode = upperBound(root, target);
//
//        if (lowerNode == null) {
//            return upperNode.data;
//        }
//        if (upperNode == null) {
//            return lowerNode.data;
//        }
//        return target - lowerNode.data > upperNode.data - target ? upperNode.data : lowerNode.data;
//    }
//
//    private static CtCILibrary.TreeNode lowerBound(CtCILibrary.TreeNode root, double target) {
//        if (root == null) {
//            return null;
//        }
//        if (target <= root.data) {
//            return lowerBound(root.left, target);
//        } else {
//            if (lowerBound(root.right, target) != null) {
//                return lowerBound(root.right, target);
//            } else {
//                return root;
//            }
//        }
//
//    }
//
//    private static CtCILibrary.TreeNode upperBound(CtCILibrary.TreeNode root, double target) {
//        if (root == null) {
//            return null;
//        }
//        if (target > root.data) {
//            return upperBound(root.right, target);
//        } else {
//            if (upperBound(root.left, target) != null) {
//                return upperBound(root.left, target);
//            } else {
//                return root;
//            }
//        }
//    }
}
