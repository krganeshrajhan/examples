package example.java.algorithms.searching.breadth.first;

//import lombok.AllArgsConstructor;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode leftNode = queue.poll();
            TreeNode rightNode = queue.poll();
            if(leftNode == null && rightNode == null)
                continue;
            else if(leftNode == null || rightNode == null)
                return false;
            else if(leftNode.val != rightNode.val)
                return false;
            queue.add(leftNode.left);
            queue.add(rightNode.right);
            queue.add(leftNode.right);
            queue.add(rightNode.left);
        }
        return true;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        SymmetricTree s = new SymmetricTree();
        System.out.println(s.isSymmetric(root));;
    }

}

//@AllArgsConstructor
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
