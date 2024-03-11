package tree.example1;

import java.util.ArrayList;

public class Node {
    String data;
    ArrayList<Node> children;

    public Node(String data) {
        this.data = data;
        this.children = new ArrayList<Node>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    public String printTree(int level) {
        String result;
        result = "   ".repeat(level) + data + "\n";

        for (Node node : children) {
            result += node.printTree(level + 1);
        }

        return result;
    }
}
