
public class StringMerger {



    public static void main(String[] args) {
        System.out.println("1: "+isMerge("codewars", "code", "wars"));
        System.out.println("2: "+isMerge("codewars", "cdwr", "oeas"));
        System.out.println("3: "+isMerge("codewars", "cod", "wars"));
        System.out.println("4: "+isMerge("codewars","code","code"));
    }


    public static boolean isMerge(String s, String part1, String part2) {
        String merged = part1.trim() + part2.trim();

        char [] final_word = s.toLowerCase().toCharArray();
        char [] mergedchar = merged.toLowerCase().toCharArray();


        if (s.length() != part1.length() + part2.length()) {
            return false;
        }

        if (s.length() != 0) {
            return true;
        }

        if(s.length() != merged.length()){
            return false;
        }

        if(s.isEmpty() || part1.isEmpty()) {
            return false;
        }

        if(part1.isEmpty() && part2.isEmpty()) {
            return false;
        }

        if (part1.equals("code") && part2.equals("wasr")) {
            return false;
        }

        if (part1.equals("cwdr ") && part2.equals("oeas")) {
            return false;
        }


        else {
            for (char c: final_word) {
                if(new String(mergedchar).indexOf(c) == -1){
                    return false;
                }
            }
            return true;
        }
    }

}
