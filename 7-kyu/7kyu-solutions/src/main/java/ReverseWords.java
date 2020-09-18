import java.util.ArrayList;
import java.util.List;

public class ReverseWords {


    public static void main(String[] args) {

        String test1 = "ehT kciuq nworb xof spmuj revo eht yzal .god";
        String test2 = "elppa";
        String test3 = "elbuod  decaps  sdrow";
        String test4 = "   lepel     lepel   ";

        System.out.print(reverseWords(test3));
    }


    public static String reverseWords(final String original) {
        if (original.trim().isEmpty()) {
            return original;
        }
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(original);
        // reverse StringBuilder input1
        input1 = input1.reverse();

        List<String> backToPlace = new ArrayList<String>();
        String[] splited = input1.toString().split(" ");
        String backOriginal = " ";

        for (int i = splited.length - 1; i >= 0; i--) {
            backOriginal = splited[i];
            backToPlace.add(backOriginal.trim());
        }

        String sentence = "";

        return String.join(" ", backToPlace);
    }
}
