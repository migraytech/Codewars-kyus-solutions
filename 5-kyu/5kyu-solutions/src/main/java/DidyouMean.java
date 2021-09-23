import java.util.*;
import java.util.stream.IntStream;

public class DidyouMean {

    public static void main(String[] args) {

        String[] words = new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"};
        String similair = "berry";
        String [] test = new String[]{ "wars", "codec", "codewars"};
        String  word = "coddwars"; // must return "codewars"
        String [] test2 = new String[]{ "zqdrhpviqslik", "karpscdigdvucfr"};
        String  word2 = "rkacypviuburk"; // must return "codewars"


        System.out.print(findMostSimilar(word2, test2));
    }


    public static String findMostSimilar(String to, String[] words) {

        String solution = "";
        int count = 0;
        // Check which is Most similair
        HashMap<String, Integer> nameAndcount = new HashMap<String, Integer>();

        int length = to.length();

        for (String word : words) {
            nameAndcount.put(word, count);
            char[] CharacterWord = word.toCharArray();
            for (char c : CharacterWord) {

                /// check on duplicated word not counted !!! in char
                if (to.indexOf(c) != -1)

                    nameAndcount.put(word, nameAndcount.get(word)+1);
            }
        }



        int lessChanged = length;

        int maxPoint =  Collections.max(nameAndcount.values());



        for (Map.Entry<String, Integer> entry : nameAndcount.entrySet()) {

            int sum = 0;
            int wordLength = entry.getKey().length();

            if( wordLength >= length) {
                sum = Math.abs(length - entry.getValue() + entry.getKey().length() - length);
                if (sum < lessChanged) {
                    lessChanged = sum;
                    solution = entry.getKey();
                }
            }
            else if (maxPoint == entry.getValue()) {
                lessChanged = sum;
                solution = entry.getKey();
            }







        }



        return solution;

    }


}
