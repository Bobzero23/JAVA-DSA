package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    int val;
    InvertBinaryTree left;
    InvertBinaryTree right;

    InvertBinaryTree () {}

    InvertBinaryTree (int val) {
        this.val = val;
    }

    InvertBinaryTree (int val, InvertBinaryTree left, InvertBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {

    }
}

class IBTSolution {
    public InvertBinaryTree invertBinaryTree(InvertBinaryTree root) {
        if (root == null) return null;

        Queue<InvertBinaryTree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            //swa
            InvertBinaryTree currentNode = queue.poll();
            InvertBinaryTree tempNode = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = tempNode;
        }

        return root;
    }
}
