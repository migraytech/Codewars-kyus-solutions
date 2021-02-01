import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArraySingle {

    public static void main(String[] args) {

        int array [] = new int[] {0,0,3,4,6,3};
        System.out.print(repeats(array));
    }

    public static int repeats(int [] arr){

        // Third solution : using Hash table data structure to find duplicates
        Map<Integer, Integer> nameAndCount = new HashMap<>();

        int solution = 0;
        // build hash table with count
        for (int number : arr) {
            Integer count = nameAndCount.get(number);
            if (count == null) {
                nameAndCount.put(number, 1);
            } else {
                nameAndCount.put(number, ++count);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = nameAndCount.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() == 1 ) {
                solution += entry.getKey();
            }
        }

        return  solution;
    }
}
