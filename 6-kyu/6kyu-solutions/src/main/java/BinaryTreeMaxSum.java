public class BinaryTreeMaxSum {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(-22);
        root.right =  new TreeNode(11);

        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(50);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(2);



        System.out.print("Path to with maxSum:"+maxSum(root));


    }

    public static class TreeNode {
        TreeNode left , right;
        int value;

        public TreeNode(int value){
            this.value = value;
            right = left = null;
        }
    }

    public static int maxSum(TreeNode root) {

        int maxValueLeft = 0, maxValueRight = 0;
        if(root == null)
            return 0;

        int res = root.value;

        // add the previous number;
         maxValueLeft  =  maxSum(root.left)  +  res;
         maxValueRight  =  maxSum(root.right) +  res ;
         int Left =  maxValueLeft;
        int Right =  maxValueRight;

        return Math.max(Left, Right);

    }



}
