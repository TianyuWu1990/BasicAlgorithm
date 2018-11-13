//package Tree;
//
//public class In_Post_Tree {
//    //1
//    //|\
//    //2 3
//    //|  \
//    //4   7
//    //in [4, 2, 1, 3, 7]
//    //po [4, 2, 7, 3, 1]
//    class Solution {
//        public TreeNode buildTree(int[] inorder, int[] postorder) {
//            if (inorder.length == 0 || postorder.length == 0 || inorder.length != postorder.length) return null;
//            int ip = inorder.length - 1; // inorder pointer
//            int pp = postorder.length - 1; // postorder pointer
//
//            Stack<TreeNode> stack = new Stack<TreeNode>();
//            TreeNode prev = null; //
//            TreeNode root = new TreeNode(postorder[pp]); // root node must be the last element of postorder
//            stack.push(root);
//            pp--;
//
//            while (pp >= 0) { // traverse postorder array
//                while (!stack.isEmpty() && stack.peek().val == inorder[ip]) {
//                    prev = stack.pop();
//                    ip--;
//                } // find same node in postorder and inorder
//                TreeNode newNode = new TreeNode(postorder[pp]); // new traversed node
//                if (prev != null) { // if there is a same node
//                    prev.left = newNode; // new traversed node is the same node's left child
//                } else if (!stack.isEmpty()) { // if no same node, new node is the right child of stack top
//                    TreeNode currTop = stack.peek();
//                    currTop.right = newNode;
//                }
//                stack.push(newNode);
//                prev = null;
//                pp--;
//            }
//
//            return root;
//        }
//    }
//}
