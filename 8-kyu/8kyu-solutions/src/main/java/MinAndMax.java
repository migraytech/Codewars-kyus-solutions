import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMax {

        public static void main(String[] args) {

            int [] min = new int[]{-52, 56, 30, 29, -54, 0, -110};
            int [] max = new int[] {4,6,2,1,9,63,-134,566};

            System.out.print(min(min));
            System.out.print(max(max));
        }

        public static int min(int[] list) {
            List<Integer> solution = Arrays.stream(list).boxed().collect(Collectors.toList());
            int minIndex = solution.indexOf(Collections.min(solution));
            return  solution.get(minIndex);
        }

        public static int max(int[] list) {
            List<Integer> solution = Arrays.stream(list).boxed().collect(Collectors.toList());
            int maxIndex =  solution.indexOf(Collections.max(solution));
            return solution.get(maxIndex);
        }



}
