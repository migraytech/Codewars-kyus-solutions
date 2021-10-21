import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxSumOfArray {

    //    assertEquals("Example array should have a max of 6", 6, Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    //    assertEquals("Empty arrays should have a max of 0", 0, Max.sequence(new int[]{}));


    //Kadane’s Algorithm


    public static void main(String[] args) {
        int [] array = new int []{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sequence(array));
    }
    public static int sequence(int[] arr) {

        if(arr.length == 0)
            return 0;
        else
            







        //*This wrong algolritme to find the max sum of the subarray*//
//        HashMap<Integer,Integer> map =  new HashMap<>();
//        int count = 0;
//
//        if(arr.length == 0)
//            return 0;
//        else
//            for (int i = 0; i < arr.length; i++) {
//                map.put(i,arr[i]);
//            }
//
//        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Integer, Integer> set:entrySet) {
//            count+=set.getValue();
//        }
//        return count;
    }






}
