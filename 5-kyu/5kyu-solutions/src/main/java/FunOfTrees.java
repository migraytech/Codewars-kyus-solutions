import java.util.LinkedList;

public class FunOfTrees {

    public static void main(String[] args) {
        //TreeNode expected = new TreeNode(17, new TreeNode(0, new TreeNode(3), new TreeNode(15)), new TreeNode(-4));

        int [] test = new int[] {17, 0, -4, 3, 15};
        System.out.print(arrayToTree(test));

    }
    //If we observe carefully we can see that if parent node is at index i in the array then the left child of that node is at index (2*i + 1) and right child is at index (2*i + 2) in the array.
    //Using this concept, we can easily insert the left and right nodes by choosing its parent node. We will insert the first element present in the array as the root node at level 0 in the tree and start traversing the array and for every node i we will insert its both childs left and right in the tree.
    //Below is the recursive program to do this:

    public static TreeNode arrayToTree(int[] array) {


        if(array.length == 0) return null;

        TreeNode tree = new TreeNode(0);
        TreeNode root = insertLevelOrder(array,tree,0);

        return root; // TODO: implementation
    }
    public static TreeNode insertLevelOrder(int[] arr, TreeNode root, int i)
    {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }




    public static class TreeNode {

        TreeNode left;
        TreeNode right;
        int value;

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode(int value) {
            this(value, null, null);
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "left=" + left +
                    ", right=" + right +
                    ", value=" + value +
                    '}';
        }
    }

}
