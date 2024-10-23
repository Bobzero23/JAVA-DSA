package tree.validateBST;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        Integer[] input = {5,1,4,null,null,3,6};
        TreeNode root = treeNode.insertTreeNode(input);
        List<Integer> result = treeNode.levelOrderTraversal(root);
        System.out.println(result);

        ValidateBST validateBST = new ValidateBST();
        boolean finalResult = validateBST.validateBST(root);
        System.out.println(finalResult);
    }
}
