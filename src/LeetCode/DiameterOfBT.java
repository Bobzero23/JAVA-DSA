package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Node {
    Node left;
    Node right;
    int value;

    public Node () {

    }
}
public class DiameterOfBT {
    Node root;

    public DiameterOfBT() {
        this.root = null;
    }

    public static int diameterOfBT (Node root) {
        Map<Node, Integer> map = new HashMap<>();
        Stack<Node> stack = new Stack<>();
        int diameter = 0;

        if (root != null)
            stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.peek();

            // Fill up stack to perform post-order traversal
            if (node.left != null && !map.containsKey(node.left)) {
                stack.push(node.left);
            } else if (node.right != null && !map.containsKey(node.right)) {
                stack.push(node.right);
            } else {

                // Process the root, once left and right subtree have been processed
                stack.pop();
                int leftDepth = map.getOrDefault(node.left, 0);
                int rightDepth = map.getOrDefault(node.right, 0);

                //finding the longest depth between left and right and then add 1 and assign to the parent
                map.put(node, 1 + Math.max(leftDepth, rightDepth));

                // Update the max diameter found so far
                diameter = Math.max(diameter, leftDepth + rightDepth);
            }
        }
        return diameter;
    }

    public static void main(String[] args) {
        Node N1 = new Node();
        N1.value = 1;
        Node N2 = new Node();
        N2.value = 2;
        Node N3 = new Node();
        N3.value = 3;
        Node N4 = new Node();
        N4.value = 4;
        Node N5 = new Node();
        N5.value = 5;

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;

        int result = diameterOfBT(N1);
        System.out.println(result);
    }
}


