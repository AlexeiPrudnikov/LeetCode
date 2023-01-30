public class Main {
    public static Node connectPlus(Node current, Node root, boolean isLeft) {
        Node result = current;
        return result;
    }

    public static Node connect(Node root) {
        Node result = root;
        if (root == null) return null;
        result = connectPlus(root, null, true);
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1,
                new Node(2,
                        new Node(4),
                        new Node(5),
                        null),
                new Node(3,
                        new Node(6),
                        new Node(7),
                        null),
                null);
        root = connect(root);
        System.out.println("Hello world!");
    }
}