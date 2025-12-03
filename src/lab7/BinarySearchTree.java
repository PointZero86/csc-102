package lab7;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {}
    public void add(Comparable obj) {
        Node newNode = new Node();
        newNode.data = obj; // Object To Add
        newNode.left = null;
        newNode.right = null;
        if (root == null) {
            root = newNode; // If It's A New Tree, Add At The Very Top
        }
        else {
            root.addNode(newNode); // See addNode Within Node Class
        }

    }

    class Node {
        public Comparable data;
        public Node left;
        public Node right;
        public void addNode(Node newNode) {
            int comp = newNode.data.compareTo(data);
            // compareTo Gives a 1 or -1 Based On Result
            // -1 [Less Than]
            // 1 [Greater Than]
            // Although It Can Be Equal, We Don't Care About That
            if (comp < 0) { // Value Is Smaller
                // Falls To The Left Side
                if (left == null) { // Null = Make A New Node
                    left = newNode;
                }
                else { // Continue The Branch
                    left.addNode(newNode);
                }
            }
            else if (comp > 0) { // Value Is Larger
                // Falls To The Right Side
                if (right == null) { // Null = Make A New Node
                    right = newNode;
                }
                else { // Continue The Branch
                    right.addNode(newNode);
                }
            }
        }
    }
}
