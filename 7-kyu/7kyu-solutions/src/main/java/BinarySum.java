public class BinarySum {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        System.out.print(treeNode.getClass().toGenericString());

        BinaryTree tree = new BinaryTree();

//        /*create root*/
//        tree.root = new TreeNode(1);
//
//        /* following is the tree after above statement
//
//              1
//            /   \
//          null  null     */
//
//        tree.root.left = new TreeNode(2);
//        tree.root.right = new TreeNode(3);
//
//        /* 2 and 3 become left and right children of 1
//               1
//            /     \
//          2        3
//        /   \     /  \
//      null null null null  */
//
//
//        tree.root.left.left = new TreeNode(4);
//        /* 4 becomes left child of 2
//                    1
//                /       \
//               2          3
//             /   \       /  \
//            4    null  null  null
//           /   \
//          null null
//         */
        tree.root = new TreeNode(2);
        tree.root.left = new TreeNode(7);
        tree.root.right = new TreeNode(5);
        tree.root.left.right = new TreeNode(60);
        tree.root.left.right.left = new TreeNode(1);
        tree.root.left.right.right = new TreeNode(11);
        tree.root.right.right = new TreeNode(9);
        tree.root.right.right.left = new TreeNode(4);

        // Function call
        System.out.println("Maximum element is "
                + findMax(tree.root));

    }

    public static int findMax(TreeNode root)
    {
        if (root == null)
            return Integer.MIN_VALUE;

        int res = root.value;
        int lres = findMax(root.left);
        int rres = findMax(root.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;

        public TreeNode(int item) {
            value = item;
            right = left = null;
        }
    }
    static class BinaryTree {
        // Root of Binary Tree
        TreeNode root;

        // Constructors
        BinaryTree(int key) {
            root = new TreeNode(key);
        }

        BinaryTree() {
            root = null;
        }
    }
}
