import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JomoPipi {

    public static void main(String[] args) {

        String test = "Hello, World!";
        String test2 = "Hello, World! It's me, JomoPipi!";
        System.out.print(numericals(test2));
    }

    public static String numericals(String s) {
        int count;

        List<Integer> counter = new ArrayList<>();
        List<String> countedString = new ArrayList<>();
        for (String value : s.split("")){
            count = 0;
            if(!countedString.contains(value)) {
                countedString.add(value);
                count++;
            }
            else {
                int  counted =  Collections.frequency(countedString, value);
                countedString.add(value);
                count = count + counted +1;
            }
            counter.add(count);
        }
        return counter.stream().map(String::valueOf).collect(Collectors.joining(""));

    }

}
