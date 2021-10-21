

public class MaxSumOfArray {

    //    assertEquals("Example array should have a max of 6", 6, Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    //    assertEquals("Empty arrays should have a max of 0", 0, Max.sequence(new int[]{}));


    //Kadane’s Algorithm


    public static void main(String[] args) {
        int [] array = new int []{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int [] array2 = new int []{};

        System.out.println(sequence(array2));
    }
    public static int sequence(int[] arr) {

        if(arr.length == 0)
            return 0;
        else
        {
            // Kadane's algorithm
            //The simple idea of Kadane’s algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this).
            // And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this). Each time we get a positive-sum compare it with max_so_far and update max_so_far if it is greater than max_so_far
            int max_sum = 0 , max_end = 0;

            for (int j : arr) {

                max_end = max_end + j;
                if (max_sum < max_end) {
                    max_sum = max_end;
                }
                if (max_end < 0) {
                    max_end = 0;
                }
            }
            return max_sum;

        }

//Kadane’s Algorithm can be viewed both as a greedy and DP. As we can see that we are keeping a running sum of integers and when it becomes less than 0, we reset it to 0 (Greedy Part). This is because continuing with a negative sum is way more worse than restarting with a new range. Now it can also be viewed as a DP, at each stage we have 2 choices: Either take the current element and continue with previous sum OR restart a new range. These both choices are being taken care of in the implementation.
//
//Time Complexity: O(n)



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
