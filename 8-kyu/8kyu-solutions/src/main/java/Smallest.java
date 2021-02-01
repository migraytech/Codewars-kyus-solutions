import java.util.Arrays;

public class Smallest {

    //
    //Given [34, 15, 88, 2] your solution will return 2
    //Given [34, -345, -1, 100] your solution will return -345

    public static void main(String[] args) {
        int array1 [] = new int [] {4,1,2,7,5};
        int array2 [] = new int[] {3,1,2,-1};
        int array3 [] = new int[] {3,1,2,5};
        System.out.println(findSmallestInt(array1));
    }

    public static int findSmallestInt(int[] array) {

        //check smallest in array
        // give the smallest in variable
        //Arrays.sort sort the array index set the array in smallest to highest
         Arrays.sort(array);
         int variable = array[0];
        return variable;
    }

}
