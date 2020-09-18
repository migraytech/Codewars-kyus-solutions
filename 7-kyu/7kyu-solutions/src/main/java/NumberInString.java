import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberInString {

    public static void main(String[] args) {
        // means any character from 0 to infinite occurence, than the \\d+ (double backslash I think is just to escape the second backslash) and \d+ means a digit from 1 time to infinite
        //str.matches(".*\\d.*");
        String test1 ="2ti9iei7qhr5";
        String test2 = "gh12cdy695m1";
        String test3= "lu1j8qbbb85";
        String test4= "185lu1j8qbbb85";
        System.out.println(solve(test1));
    }

    public static int solve(String s){
        //.this methode check if string contains a number
        boolean value = s.matches(".*\\d.*");
        //method extract digits in string variable with '\\D' (double backslash I think is just to escape the second backslash) and \d+ means a digit from 1 time to infinite

        // 1.[ and ] delimites a set of characters to be single matched, i.e., only one time in any order
        // 2. ^ Special identifier used in the beginning of the set, used to indicate to match all characters not present in the delimited set, instead of all characters present in the set.
        // 3. + Between one and unlimited times, as many times as possible, giving back as needed
        // 4. -? One of the characters “-” and “?”
        // 5. 0-9 A character in the range between “0” and “9”
        String str =  s.replaceAll("[^-?0-9]+", " ");
        List<String> array  = Arrays.asList(str.trim().split(" "));

        List<Integer> numbers = new ArrayList<Integer>();
        for(String number : array) numbers.add(Integer.valueOf(number));
        Collections.sort(numbers);
        return numbers.get(numbers.size()-1);
    }
}
