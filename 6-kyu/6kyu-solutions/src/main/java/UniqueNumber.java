import java.util.*;


public class UniqueNumber {


    //Find the unique numbers
    public static void main(String[] args) {
        double[] test1 =  new double [] {10,20,0,10,0,1,1,4,20};
        double[] test2 =  new double [] {10.55,20,0,10.55,0.9,1.1,1.1,4,20,};
        System.out.print(findUniq(test1));
    }
    public static double findUniq(double arr[]) {
        double unique = 0;

// Brute force method
// ArrayList<Double> checkerList = new ArrayList<>();
//        double unique = 0;
//        for (int i = 0;  i<arr.length;  i++) {
//            for (int x = arr.length-1; x >= 0 ; x--) {
//                if(arr[i] == arr[x]) {
//                    if (i != x) {
//                        checkerList.add(arr[i]);
//                    }
//                }
//            }
//            if(!checkerList.contains(arr[i])) {
//                unique = arr[i];
//                break;
//            }
//        }


        // Third solution : using Hash table data structure to find duplicates
        Map<Double, Integer> nameAndCount = new HashMap<>();

        // build hash table with count
        for (double number : arr) {
            Integer count = nameAndCount.get(number);
            if (count == null) {
                nameAndCount.put(number, 1);
            } else {
                nameAndCount.put(number, ++count);
            }
        }

        // Print duplicate elements from array in Java
        Set<Map.Entry<Double, Integer>> entrySet = nameAndCount.entrySet();
        for (Map.Entry<Double, Integer> entry : entrySet) {
            if (entry.getValue() == 1 ) {
                unique = entry.getKey();
            }
        }
        return unique;

    }

}
