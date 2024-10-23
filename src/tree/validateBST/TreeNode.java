package tree.validateBST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    Integer val;

    TreeNode(TreeNode left, TreeNode right, Integer val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    TreeNode (Integer val) {
        this.val = val;
    }

    public TreeNode() {
    }

    public TreeNode insertTreeNode(Integer[] nodeList) {
        if (nodeList.length == 0) {
            System.out.println("Couldn't create a tree: No data given");
            return null;
        }

        TreeNode node = new TreeNode(nodeList[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        int i = 1;
        while (i < nodeList.length) {
            TreeNode currentNode = queue.poll();

            if (i < nodeList.length) {
                currentNode.left = new TreeNode(nodeList[i++]);
                queue.offer(currentNode.left);
            }

            if (i < nodeList.length) {
                currentNode.right = new TreeNode(nodeList[i++]);
                queue.offer(currentNode.right);
            }
        }

        return node;
    }

    public List<Integer> levelOrderTraversal(TreeNode root) {
        if (root == null) {
            System.out.println("Couldn't traversal a null tree");
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> outputList = new ArrayList<>();

        while (!queue.isEmpty()) {
            int level = queue.size();

            for (int i = 0; i < level; i++) {
                TreeNode currentNode = queue.poll();
                outputList.add(currentNode.val);

                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }
        }

        return outputList;
    }
}
