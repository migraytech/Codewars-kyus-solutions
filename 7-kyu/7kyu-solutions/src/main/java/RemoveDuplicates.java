import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {


        int [] test = new int[]{3,4,4,3,6,3};
        int [] test2 = new int[]{1,2,1,2,1,2,3};
        int [] test3 = new int[]{1,2,3,4};
        int [] test4 = new int[]{1,1,4,5,1,2,1};

        System.out.print(Arrays.toString(solve(test2)));
    }

    public static int[] solve (int [] arr)
    {
        int [] newarray = new int[0];
        ArrayList<Integer> checkerList = new ArrayList<>();
        List<Integer> list = new ArrayList<>(arr.length);

        for (int i : arr) {
            list.add(i);
        }

        // get first index copy
         for (int i = 0;  i<arr.length;  i++) {
            for (int x = i+1; x < arr.length ; x++) {
                if (arr[i] == arr[x]) {
                    if(!checkerList.contains(i))
                        checkerList.add(i);
                }
            }
         }

        // remove first left duplicates
        for (Integer integer : checkerList) {
            list.remove(list.get(integer));
        }


        return list.parallelStream().mapToInt(Integer::intValue).toArray();
    }
}
