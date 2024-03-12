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
}
