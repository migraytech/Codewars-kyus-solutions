public class SimpleLetterRemoval {


    public static void main(String[] args) {

        String test1 ="abracadabra";
        int k =1;
        String test2 ="abracadabra";
        int k2 =2;
        String test3 ="abracadabra";
        int k3 =3;
        String test4 ="abracadabra";
        int k4 =4;
        String test5 ="abracadabra";
        int k5 =5;
        String test6 ="abracadabra";
        int k6 =6;
        System.out.print(solve(test6,k6));
    }


    public static String solve(String s, int k) {

        for (int c : s.chars().sorted().limit(k).toArray())
            s = s.replaceFirst(Character.toString((char) c), "");
        return s;
    }
}
