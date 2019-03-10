package example.java.algorithms.searching.depth.first;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        List<Integer> listOfPathSum = new ArrayList<>();
        listOfPathSum = pathSum(root, listOfPathSum);
        for(Integer pathSum : listOfPathSum) {
            if(pathSum == sum)
                return true;
        }
        return false;
    }

    public List<Integer> pathSum(TreeNode root, List<Integer> listOfPathSum) {
        if(root == null) {
            ArrayList<Integer> pathSum = new ArrayList<>();
            pathSum.add(0);
            return pathSum;
        }
        List<Integer> listLeft = pathSum(root.left, listOfPathSum);
        List<Integer> listRight = pathSum(root.right, listOfPathSum);
        List<Integer> list = new ArrayList<>();
        list.addAll(listLeft);
        list.addAll(listRight);
        list = list.stream().map(x -> (x+root.val)).collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        PathSum pathSum = new PathSum();
        System.out.println(pathSum.hasPathSum(root, 22));
    }

}
