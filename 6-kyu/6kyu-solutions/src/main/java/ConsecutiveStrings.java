import java.util.ArrayList;
import java.util.List;

public class ConsecutiveStrings {

    public static void main(String[] args) {

        String [] strings =  new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};

        System.out.print(longestConsec(strings,2));
    }


    public static String longestConsec(String[] strarr, int k) {


        if (k > strarr.length || k <= 0) return "";

        // combinatie welke word groter is


        StringBuilder maxWord = new StringBuilder();
        for(int i=0; i<strarr.length-k; i++){

            StringBuilder currentWord = new StringBuilder();
            for(int j = i; j< i+k; j++) {
                currentWord.append(strarr[j]);


            }
            if (maxWord.length() < currentWord.length()) {
                maxWord = currentWord;
            }

        }

        return maxWord.toString();




    }
}
