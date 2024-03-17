package tree.binaryTree.linkedList;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLinkedList binaryTree = new BinaryTreeLinkedList();
        Node N1 = new Node();
        N1.value = "N1";
        Node N2 = new Node();
        N2.value = "N2";
        Node N3 = new Node();
        N3.value = "N3";
        Node N4 = new Node();
        N4.value = "N4";
        Node N5 = new Node();
        N5.value = "N5";
        Node N6 = new Node();
        N6.value = "N6";
        Node N7 = new Node();
        N7.value = "N7";
        Node N8 = new Node();
        N8.value = "N8";
        Node N9 = new Node();
        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;

        binaryTree.root = N1;
        System.out.println("per-order traversal");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\nin-order traversal");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("\npost-order traversal");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("\nlevel-order traversal");
        binaryTree.levelOrder();
        System.out.println("\nlevel-order searching");
        binaryTree.levelOrderSearch("N7");
        System.out.println("\nlevel-order insertion");
        binaryTree.leverOrderInsertion("N10");
        System.out.println("\nlevel-order traversal");
        binaryTree.levelOrder();
        System.out.println("\ngetting the deepest node");
        Node deepestNode = binaryTree.getDeepestNode();
        System.out.println("The deepest node is: " + deepestNode.value);
        System.out.println("\ndeleting the deepest node");
        binaryTree.deleteDeepestNode();
        System.out.println("\nlevel-order traversal");
        binaryTree.levelOrder();

    }
}
