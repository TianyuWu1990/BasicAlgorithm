package DFS.Tree;

import CtCILibrary.TreeNode;

public class ClosestBSTvalue {
    public static int closestdataue(TreeNode root, double target) {
        if (root == null) {
            return 0;
        }

        TreeNode lowerNode = lowerBound(root, target);
        TreeNode upperNode = upperBound(root, target);

        if (lowerNode == null) {
            return upperNode.data;
        }
        if (upperNode == null) {
            return lowerNode.data;
        }
        return target - lowerNode.data > upperNode.data - target ? upperNode.data : lowerNode.data;
    }

    private static CtCILibrary.TreeNode lowerBound(CtCILibrary.TreeNode root, double target) {
        if (root == null) {
            return null;
        }
        if (target <= root.data) {
            return lowerBound(root.left, target);
        } else {
            if (lowerBound(root.right, target) != null) {
                return lowerBound(root.right, target);
            } else {
                return root;
            }
        }

    }

    private static CtCILibrary.TreeNode upperBound(CtCILibrary.TreeNode root, double target) {
        if (root == null) {
            return null;
        }
        if (target > root.data) {
            return upperBound(root.right, target);
        } else {
            if (upperBound(root.left, target) != null) {
                return upperBound(root.left, target);
            } else {
                return root;
            }
        }
    }
}
