package DFS.Tree;

import java.util.Stack;

public class ValidateBST {
    class ResultType {
        public boolean isBST;
        public TreeNode maxNode, minNode;

        public ResultType(boolean isBST) {
            this.isBST = isBST;
            this.maxNode = null;
            this.minNode = null;
        }
    }

//    public class Solution {
        /**
         * @param root: The root of binary tree.
         * @return: True if the binary tree is BST, or false
         */
//        public boolean isValidBST(TreeNode root) {
//            return divideConquer(root).isBST;
//        }
//
//        private ResultType divideConquer(TreeNode root) {
//            if (root == null) {
//                return new ResultType(true);
//            }
//
//            ResultType left = divideConquer(root.left);
//            ResultType right = divideConquer(root.right);
//            if (!left.isBST || !right.isBST) {
//                return new ResultType(false);
//            }
//
//            if (left.maxNode != null && left.maxNode.val >= root.val) {
//                return new ResultType(false);
//            }
//
//            if (right.minNode != null && right.minNode.val <= root.val) {
//                return new ResultType(false);
//            }
//
//            // is bst
//            ResultType result = new ResultType(true);
//            result.minNode = left.minNode != null ? left.minNode : root;
//            result.maxNode = right.maxNode != null ? right.maxNode : root;
//
//            return result;
//        }
//    }
//
//    public boolean isValidBST(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//
//        while (root != null) {
//            stack.push(root);
//            root = root.left;
//        }
//
//        TreeNode lastNode = null;
//        while (!stack.isEmpty()) {
//            // compare to last node
//            TreeNode node = stack.peek();
//            if (lastNode != null && lastNode.val >= node.val) {
//                return false;
//            }
//            lastNode = node;
//
//            // move to next
//            if (node.right == null) {
//                node = stack.pop();
//                while (!stack.isEmpty() && stack.peek().right == node) {
//                    node = stack.pop();
//                }
//            } else {
//                node = node.right;
//                while (node != null) {
//                    stack.push(node);
//                    node = node.left;
//                }
//            }
//        }
//
//        return true;
//    }

        /*
        attempt 1: inorder traversal recursive
         */
        private TreeNode lastNode;
        private boolean isValid;
        public boolean isBalanced(TreeNode root) {
            lastNode = null;
            isValid = true;
            inOrder(root);
            return isValid;
        }

        private void inOrder(TreeNode root){
            if (root == null) {
                return;
            }
            inOrder(root.left);
            if (lastNode != null && root.val <= lastNode.val) {
                isValid = false;
                return;
            }
            lastNode = root;
            inOrder(root.right);
        }

        /*

         */
    }

