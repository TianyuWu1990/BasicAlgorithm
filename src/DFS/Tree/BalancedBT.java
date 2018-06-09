package DFS.Tree;

public class BalancedBT {
    /*
        Industrial format a result type contains several attributes
     */
    class ResultType {
        public boolean isBalanced;
        public int maxDepth;
        public ResultType(boolean isBalanced, int maxDepth) {
            this.isBalanced = isBalanced;
            this.maxDepth = maxDepth;
        }
    }


        public boolean isBalanced(TreeNode root) {
            return maxDepth(root).isBalanced;
        }

        private ResultType maxDepth(TreeNode root) {
            if (root == null) {
                return new ResultType(true, 0);
            }

            ResultType left = maxDepth(root.left);
            ResultType right = maxDepth(root.right);

            // subtree not balance
            if (!left.isBalanced || !right.isBalanced) {
                return new ResultType(false, -1);
            }

            // root not balance
            if (Math.abs(left.maxDepth - right.maxDepth) > 1) {
                return new ResultType(false, -1);
            }

            return new ResultType(true, Math.max(left.maxDepth, right.maxDepth) + 1);
        }
    }

