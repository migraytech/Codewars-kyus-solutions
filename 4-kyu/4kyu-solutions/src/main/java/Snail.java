import java.util.Arrays;

public class Snail {

    public static void main(String[] args) {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.print(Arrays.toString(snail(array)));
    }


    public static int[] snail(int[][] array) {

        int solution [] = new int[0];
        int bottomLeft = 0;
        int Upright = 0;

        // copy the array
        int [][] copyArray =  array;
        for (int i =0; i< array.length-1; i++)
        {

            // first length-1 of first row

            //
        }





        return solution ;
    }
}
