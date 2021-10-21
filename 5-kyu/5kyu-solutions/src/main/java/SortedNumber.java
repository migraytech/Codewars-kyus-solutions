import java.util.Arrays;

public class SortedNumber {



    //    assertArrayEquals(new int[]{8, 8, 9, 9, 10, 10}, Dinglemouse.sort(new int[]{8, 8, 9, 9, 10, 10}));
    //    assertArrayEquals(new int[]{4, 1, 3, 2}, Dinglemouse.sort(new int[]{1, 2, 3, 4}));

    public static void main(String[] args) {

        int [] array = new int[]{8, 8, 9, 9, 10, 10};
        int [] array2 = new int[]{4, 1, 3, 2};
        System.out.println(Arrays.toString(sort(array)));
    }


    public static int[] sort(final int array[]) {

        if (array.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
