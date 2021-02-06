public class IsPerfection {
    public static void main(String[] args) {

    }


    public static boolean isPerfect(FunOfTrees.TreeNode root) {

        if( root == null) {
            return true;
        }

        // check fot the full unbalanced tree for the left and right side
        if(countChildren(root.left) != countChildren(root.right))
            return false;

        if( root.left == null && root.right == null) {
            return true;
        }
        else {
            if(root.left == null || root.right == null)
                return false;
            return isPerfect(root.left) || isPerfect(root.right);
        }

    }

    public static int countChildren(FunOfTrees.TreeNode root)
    {
        if(root == null)
            return 0;
        else
        {
            // level higher is the index of the +1
            return 1+countChildren(root.left) + countChildren(root.right);
        }
    }
}
