
public class StringMerger {


    //    assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
    //    assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
    //    assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));

    public static void main(String[] args) {


        System.out.println(isMerge("codewars", "cod", "wars"));


    }




    public static boolean isMerge(String s, String part1, String part2) {

        String merged = part1.trim() + part2.trim();

        char [] final_word = s.toLowerCase().toCharArray();
        char [] mergedchar = merged.toLowerCase().toCharArray();


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
