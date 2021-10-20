import java.util.*;

public class FindOdd {



//    Given an array of integers, find the one that appears an odd number of times.
//
//    There will always be only one integer that appears an odd number of times.
//    Examples
//
//            [7] should return 7, because it occurs 1 time (which is odd).
//            [0] should return 0, because it occurs 1 time (which is odd).
//            [1,1,2] should return 2, because it occurs 1 time (which is odd).
//            [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//            [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

    public static void main(String[] args) {

//        assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
//        assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
//        assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
//        assertEquals(10, FindOdd.findIt(new int[]{10}));
//        assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
//        assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));


        int [] first =  new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        int [] second =  new int[]{1,1,2,-2,5,2,4,4,-1,-2,5};
        int [] third =  new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5};
        int [] four =  new int[]{10};
        int [] fifth =  new int[] {1,1,1,1,1,1,10,1,1,1,1};
        int [] six =  new int[] {5,4,3,2,1,5,4,3,2,10,10};

        System.out.println(findIt(four));
    }

    public static int findIt(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        else if (arr.length == 1)
        {
            return arr[0];
        }
        else
        {
            int counter = 0,result= 0;
            boolean isOld;

            //remove duplicate
            //create a zero list without duplicate
            int [] newArray = Arrays.stream(arr).distinct().toArray();

            //count how many times its in the array
            // count the number in the map.
            HashMap<Integer,Integer> countNumber = new HashMap<>();
            for (int number:newArray) {
                for (int j : arr) {
                    if (number == j) {
                        counter++;
                    }
                }
                countNumber.put(number,counter);
                //set the count on null
                counter = 0;
            }

            //check if the count is odd;
            Set<Map.Entry<Integer, Integer>> set = countNumber.entrySet();
            for (Map.Entry<Integer,Integer> map: set) {
                if (ifOdd(map.getValue())){

                    //save the index of the number
                    result = map.getKey();
                }
            }

            // return the index from the original array
            return result;
        }
    }
    
    public static boolean ifOdd(int value ){
        return value % 2 == 1;
    }

}
