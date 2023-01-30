public class Main {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        TreeNode result = new TreeNode();
        result = root1;
        if (root1 != null && root2 != null) {
            root1.val = root1.val + root2.val;
        }
        TreeNode help;
        if (root1 != null) {
            if (root1.left != null) {
                if (root2 != null) {
                    root1.left = mergeTrees(root1.left, root2.left);
                }
            } else {
                if (root2 != null) {
                    root1.left = root2.left;
                }
            }
            if (root1.right != null) {
                if (root2 != null) {
                    root1.right = mergeTrees(root1.right, root2.right);
                }
            } else {
                if (root2 != null) {
                    root1.right = root2.right;
                }
            }
        } else {
            if (root2 != null) {
                root1 = root2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        mergeTrees(root1, root2);
        System.out.println("Hello world!");
    }
}