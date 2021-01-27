import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {


        int [] test = new int[]{3,4,4,3,6,3};
        int [] test2 = new int[]{1,2,1,2,1,2,3};
        int [] test3 = new int[]{1,2,3,4};
        int [] test4 = new int[]{1,1,4,5,1,2,1};

        System.out.print(Arrays.toString(solve(test)));
    }

    public static int[] solve (int [] array)
    {
        int [] newarray = new int[0];

        for (int i = 0; i <array.length; i++) {
            for (int j = array.length-1; j>0;  j--) {

                if(array [i] == array[j])
                {
                    if( i != j)
                    {
                        newarray[i] = array[i];
                    }
                }
            }
        }

        return newarray;
    }
}
