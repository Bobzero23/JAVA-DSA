package tree.binaryTree.linkedList;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
    Node root;

    public BinaryTreeLinkedList() {
        this.root = null;
    }

    /*pre-order traversal*/
    void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " -> ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /*in-order traversal*/
    void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " -> ");
        inOrder(node.right);
    }

    /*post-order traversal*/
    void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " -> ");
    }

    /*level-order traversal*/
    void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.print(currentNode.value + " -> ");

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    /*level-order searching*/
    void levelOrderSearch(String value) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode.value.equals(value)) {
                System.out.println("The value was found in the tree");
                return;
            }

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        System.out.println("The value was not found in the tree");
    }

    /*level-order insertion*/
    void leverOrderInsertion(String value) {
        Node newNode = new Node();
        newNode.value = value;

        if (root == null) {
            root = newNode;
            System.out.println("Inserted new node at root");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if (currentNode.left == null) {
                currentNode.left = newNode;
                System.out.println("Successfully inserted to the left vacant");
                return;
            }else if (currentNode.right == null) {
                currentNode.right = newNode;
                System.out.println("Successfully inserted to the left vacant");
                return;
            }else {
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
    }
}
