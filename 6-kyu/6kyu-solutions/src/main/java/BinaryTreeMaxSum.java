public class BinaryTreeMaxSum {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /*create root*/
        tree.root = new TreeNode(1);

        /* following is the tree after above statement

              1
            /   \
          null  null     */

        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);

        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */


        tree.root.left.left = new TreeNode(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        System.out.print(maxSum(tree.root));
    }

    public static int maxSum(TreeNode node)
    {
        // the sum of all elements in a binary tree.

        if(node == null)
            return 0;
        else
        {
            return node.key+ maxSum(node.left)+ maxSum(node.right);
        }

    }


    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int key;

        public TreeNode(int item)
        {
            key = item;
            left = right = null;
        }
    }

    public static class BinaryTree
    {
        TreeNode root;

        // Constructors
        BinaryTree(int key)
        {
            root = new TreeNode(key);
        }

        BinaryTree()
        {
            root = null;
        }
    }

}
