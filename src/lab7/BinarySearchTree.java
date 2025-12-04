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

    // TODO
    public void remove(Comparable obj) {
        if (root == null) { // Check If There Is A Tree
            System.out.println("Exception Error Should Be Here [No Tree]");
        }
    }

    public void find(Comparable obj) {
        if (root == null) { // Check If There Is A Tree
            System.out.println("Exception Error Should Be Here [No Tree]");
        }
        else {
            if (root.findNode(obj)) {
                System.out.println("Value Found");
            }
            else {
                System.out.println("Value Not In Tree");
            }
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
            // Although It Can Be Equal, We Don't Care About That Here
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

        public boolean findNode(Comparable dataToFind) {
            int compareMe = dataToFind.compareTo(data);
            if (compareMe == 0) { // Node With Matching Data Found
                return true;
            }
            else if (compareMe < 0) { // The Goal Is To The Left
                if (left == null) {
                    return false; // Value Not In Tree
                }
                else {
                    return left.findNode(dataToFind);
                }
            }
            else { // The Goal Is To The Right
                if (right == null) {
                    return false; // Value Not In Tree
                }
                else {
                    return right.findNode(dataToFind);
                }
            }
        }
    }
}
