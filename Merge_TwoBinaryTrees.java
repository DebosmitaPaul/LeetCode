import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class Merge_TwoBinaryTrees {

    public static void main(String[] args) {
        TreeNode tree1 = createBinaryTree1();
        TreeNode tree2 = createBinaryTree2();

        tree1 = mergeTrees(tree1,tree2);
        inorder(tree1);
    }

    static Stack<List<Integer>> stack = new Stack<>();
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return  root1;
        }
        root1.val = root1.val+root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.left);

        return root1;
    }

    private static void inorder(TreeNode tree1) {
        if(tree1 == null){
            return;
        }
        System.out.print(tree1.val + " ");
        if(tree1!=null) {
            inorder(tree1.left);
        }
        if(tree1!=null) {
            inorder(tree1.right);
        }
    }

    static TreeNode createBinaryTree1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);

        root.right = new TreeNode(2);
        return root;
    }
    static TreeNode createBinaryTree2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(3);
        root.right.right  = new TreeNode(7);

        return root;
    }
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
