package DFS.Tree;





public class InorderPostorderBT {
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    /**
     * @param inorder: A list of integers that inorder traversal of a tree
     * @param postorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
        if (inorder == null || postorder == null) {
            return null;
        }
        if (inorder.length != postorder.length) {
            return null;
        }

        return myBuild(inorder, 0, inorder.length - 1,
                postorder, 0, postorder.length - 1);
    }

    private TreeNode myBuild(int[] inorder, int instart, int inend,
                             int[] postorder, int postart, int poend) {
        if (instart > inend) {
            return null;
        }

        TreeNode node = new TreeNode(postorder[poend]);
        int position = findPosition(inorder, instart, inend,
                postorder[poend]);
        node.left = myBuild(inorder, instart, position - 1,
                postorder, postart, postart + position -
                        instart - 1);
        node.right = myBuild(inorder, position + 1, inend,
                postorder, postart + position - instart,
                poend - 1);

        return node;
    }

    private int findPosition(int[] inorder, int instart,
                             int inend, int value) {
        for (int i = instart; i < inend; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
