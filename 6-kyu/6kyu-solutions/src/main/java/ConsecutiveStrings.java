import java.util.ArrayList;
import java.util.List;

public class ConsecutiveStrings {

    public static void main(String[] args) {

        String [] strings =  new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};

        System.out.print(longestConsec(strings,2));
    }


    public static String longestConsec(String[] strarr, int k) {

        String solution = "";
        List<String> listOfLongest =  new ArrayList<String>();



        String baseword = "";

        if (k > strarr.length || k <= 0) return "";

        // combinatie welke word groter is



        for(int i=0; i<strarr.length; i++){

            for(int j = i+k; j<strarr.length; j++) {
                String word = strarr

                if(word.length() > baseword.length()){
                    baseword = word;
                    listOfLongest.add(baseword);
                }
            }

        }

        int index = listOfLongest.indexOf(baseword);
        listOfLongest.remove(index);

        return listOfLongest.get(1);




    }
}
