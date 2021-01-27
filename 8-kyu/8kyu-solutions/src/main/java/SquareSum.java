public class SquareSum {

    public static void main(String[] args) {

        int [] test = new int[] {1,2,2};
        int [] test2 = new int[] {1,2};
        int [] test3 = new int[] {5,-3,4};

         System.out.print(squareSum(test3));
    }


    public static int squareSum(int[] n)
    {
        //Your Code
        int sum = 0;
        int power = 2;
        for (int i = 0; i < n.length; i++) {
            sum += Math.pow(n[i],power);
        }
        return  sum;
    }
}
