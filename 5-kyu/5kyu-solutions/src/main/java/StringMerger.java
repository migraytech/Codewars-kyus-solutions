
public class StringMerger {



    public static void main(String[] args) {
        //    assertTrue("codewars can be created from cdwr and oeas",

        System.out.println(isMerge("codewars", "code", "wars"));
        System.out.println(isMerge("codewars", "cdwr", "oeas"));
        System.out.println(isMerge("codewars", "cod", "wars"));
    }




    public static boolean isMerge(String s, String part1, String part2) {

        String merged = part1.trim() + part2.trim();

        char [] final_word = s.toLowerCase().toCharArray();
        char [] mergedchar = merged.toLowerCase().toCharArray();



        if(s.length() != merged.length())
            return false;


        if(final_word.length == 0 || mergedchar.length == 0){
            return false;
        }

        if(mergedchar.length != final_word.length){
            return false;
        }

        if(part1.isEmpty() || part2.isEmpty())
            return false;
        
        for (char c: final_word) {
            if(new String(mergedchar).indexOf(c) == -1){
                return false;
            }
        }


        return true;
    }

}
