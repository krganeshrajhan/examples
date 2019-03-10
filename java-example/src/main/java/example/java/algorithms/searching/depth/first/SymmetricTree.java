package example.java.algorithms.searching.depth.first;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return validateTree(root, root);
    }

    public boolean validateTree(TreeNode leftNode, TreeNode rightNode) {
        if(leftNode==null && rightNode == null)
            return true;
        if(leftNode == null || rightNode == null)
            return false;
        return leftNode.val == rightNode.val &&
                validateTree(leftNode.left, rightNode.right) &&
                validateTree(leftNode.right, rightNode.left);
    }
}

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
