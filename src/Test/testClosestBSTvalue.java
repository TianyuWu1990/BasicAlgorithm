package Test;

import CtCILibrary.AssortedMethods;
import CtCILibrary.BTreePrinter;
import CtCILibrary.TreeNode;
import DFS.Tree.ClosestBSTvalue;

public class testClosestBSTvalue {
    public static void main(String[] args) {
        int[] testarr = new int[] {1,2,3,4,5,6,7,8};
        TreeNode root = AssortedMethods.randomBST(10, 1, 20);
        BTreePrinter.printNode(root);

        System.out.println(ClosestBSTvalue.closestdataue(root, 10));
    }
}
