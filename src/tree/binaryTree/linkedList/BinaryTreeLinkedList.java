package tree.binaryTree.linkedList;

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
}
