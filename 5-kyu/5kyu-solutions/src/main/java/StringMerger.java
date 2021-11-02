
public class StringMerger {


    public static void main(String[] args) {
//        System.out.println("1: "+isMerge("codewars", "code", "wars"));
//        System.out.println("2: "+isMerge("codewars", "cdwr", "oeas"));
        System.out.println("3: " + isMerge("codewars", "code", "wasr"));
        System.out.println("4: " + isMerge("codewars", "code", "code"));
    }


    public static boolean isMerge(String s, String part1, String part2) {

        String merged = part1.trim() + part2.trim();

        char[] final_word = s.toLowerCase().toCharArray();
        char[] mergedchar = merged.toLowerCase().toCharArray();


        if (s.equals("")) {
            return part1.equals("") && part2.equals("");
        }


        if (s.length() != part1.length() + part2.length()) {
            return false;
        }

        if (part1.equals(part2)) {
            return false;
        }

        else {

            // different algoritme

        }
        return false;

    }
}
