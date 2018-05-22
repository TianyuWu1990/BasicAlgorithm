package BFS;


import java.util.LinkedList;
import java.util.Queue;

public class BTSerializeDeserialize {
    public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        if (root == null) return "#";

        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur == null) {
                sb.append("#");
            }
            else {
                sb.append(cur.val);
                q.offer(cur.left);
                q.offer(cur.right);
            }
            sb.append(" ");
        }
        String res = sb.toString();
        return res.substring(0, res.length() - 1);
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        data = data.trim();
        if (data.equals("#")) {
            return null;
        }

        String[] nodevalues = data.split("\\s+");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode head = new TreeNode(Integer.parseInt(nodevalues[0]));
        q.offer(head);

        int count = 1;
        while (count < nodevalues.length ) {
            TreeNode cur = q.poll();
            if (nodevalues[count].equals("#")) {
                cur.left = null;
                count++;
            }
            else {
                TreeNode newnode = new TreeNode(Integer.parseInt(nodevalues[count]));
                cur.left = newnode;
                q.offer(cur.left);
                count++;
            }

            if (nodevalues[count].equals("#")) {
                cur.right = null;
                count++;
            }
            else {
                TreeNode newnode = new TreeNode(Integer.parseInt(nodevalues[count]));
                cur.right = newnode;
                q.offer(cur.right);
                count++;
            }
        }
        return head;


    }
}
