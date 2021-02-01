import java.util.*;

public class StrayNumber {
    public static void main(String[] args) {

    }

   public  static int stray(int[] numbers) {

       Map<Integer, Integer> numbersList = new HashMap<>();

       int solution = 0;
       // build hash table with count
       for (int number : numbers) {
           Integer count = numbersList.get(number);
           if (count == null) {
               numbersList.put(number, 1);
           } else {
               numbersList.put(number, ++count);
           }
       }

       Set<Map.Entry<Integer, Integer>> entrySet = numbersList.entrySet();
       for (Map.Entry<Integer, Integer> entry : entrySet) {
           if (entry.getValue() == 1) {
               solution = entry.getKey();
           }
       }
       return solution;

   }
}
