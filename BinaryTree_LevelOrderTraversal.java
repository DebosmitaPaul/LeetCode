import java.util.*;

public class BinaryTree_LevelOrderTraversal {
    static List<List<Integer>> list = new ArrayList<>();

    //Method 1 -> optimized
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int qSize = queue.size();
                List<Integer> list = new ArrayList<>(); // store elements from particular level.

                while (qSize > 0) {
                    qSize--;
                    TreeNode curr = queue.poll();
                    list.add(curr.val);

                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
                result.add(list);
            }
        }
        return result;
    }

    // Method 2
    static Map<Integer, List<Integer>> map = new HashMap<>();
    public List<List<Integer>> levelOrder_02(TreeNode root) {
        if(root == null){
            return null;
        }
        getLevel(root,0);
        List<List<Integer>> list = new ArrayList<>();
        map.keySet().stream().sorted().forEach(i->{
            list.add(map.get(i));
        });
        return list;
    }
    static void getLevel(TreeNode root, int level){
        if(root == null){
            return;
        }
        List<Integer> list = map.getOrDefault(level, new ArrayList());
        list.add(root.val);
        if(!map.containsKey(level)){

            map.put(level,list);
        }

        getLevel(root.left, level+1);
        getLevel(root.right, level+1);
    }


    public static void main(String[] args) {
        BinaryTree_LevelOrderTraversal bt = new BinaryTree_LevelOrderTraversal();
        TreeNode root = bt.createBinaryTree();
        List<List<Integer>> result = bt.levelOrder(null) ;
        System.out.println("Depth of binary tree :"+result);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private TreeNode createBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new  TreeNode(8);

        return root;
    }
}
