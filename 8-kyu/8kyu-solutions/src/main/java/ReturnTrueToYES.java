public class ReturnTrueToYES {


    // "Yes" string for true, or a "No" string for fal
    public static void main(String[] args) {

     System.out.println(boolToWord(true));

    }

    public static String boolToWord(boolean b)
    {
        return  b ? "Yes":"No";
    }
}
