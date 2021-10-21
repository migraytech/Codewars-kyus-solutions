public class FindTheIndex {


    //        assertEquals(3,Kata.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
    //        assertEquals(1,Kata.findEvenIndex(new int[] {1,100,50,-51,1,1}));
    //        assertEquals(-1,Kata.findEvenIndex(new int[] {1,2,3,4,5,6}));
    //        assertEquals(3,Kata.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
    //        assertEquals(-1,Kata.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    //        assertEquals(1,Kata.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
    //        assertEquals(6,Kata.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));


    //The lowest index N where the side to the left of N is equal to the side to the right of N. If you do not find an index that fits these rules, then you will return -1.
    //If you are given an array with multiple answers, return the lowest correct index.
    public static void main(String[] args) {

        int [] array = new int[] {1,2,3,4,3,2,1};

        System.out.println(findEvenIndex(array));
    }


    public static int findEvenIndex(int[] arr) {

        if(arr.length == 0)
            return -1;
        else
        {
            int index = 0;
            int max_right = 0, max_left = 0, length = 0;

            length = arr.length;
            max_left = arr[index];
            max_right = length-1;

            for (int i = 0; i < ; i++) {


            }




            return index;
        }
    }
}
