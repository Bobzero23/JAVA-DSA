package LeetCode;

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

    public static int diameterOfBT (Node node) {

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


