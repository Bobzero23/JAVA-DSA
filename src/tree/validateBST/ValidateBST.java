package tree.validateBST;

import java.util.LinkedList;
import java.util.List;

public class ValidateBST {
    public boolean validateBST (TreeNode root) {
        List<Integer> inOrderList = new LinkedList<>();

        if (root == null) {
            System.out.println("Couldn't validate an empty tree");
            return false;
        }


        helper(root, inOrderList);
        boolean BST = true;
        int prev = inOrderList.getFirst();

        for (int i = 1; i < inOrderList.size(); i++) {
            if (inOrderList.get(i) <= prev) return false;
            prev = inOrderList.get(i);
        }

        return BST;
    }

    private void helper(TreeNode treeNode, List<Integer> inOrderList) {
        if (treeNode == null) return;

        helper(treeNode.left, inOrderList);
        inOrderList.add(treeNode.val);
        helper(treeNode.right, inOrderList);
    }
}
