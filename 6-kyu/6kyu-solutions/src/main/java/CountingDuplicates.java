import java.util.HashMap;

public class CountingDuplicates {


    public static void main(String[] args) {


        String test = "abcde";
        String test2 = "aabcde";
        System.out.print(duplicateCount(test2));

    }


    public static int duplicateCount(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        text.chars().forEach(c -> map.merge(Character.toLowerCase((char) c), 1, (curVal, initVal) -> curVal + initVal));
        return (int) map.entrySet().stream().filter(e -> e.getValue() > 1).count();
    }
}
