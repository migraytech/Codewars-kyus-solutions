import java.util.Arrays;

public class WhoLikesIt {

    public static void main(String[] args) {

        String names = "Peter,Jan,Jan,Nan,Kees";

       System.out.print(whoLikesIt(names));
    }


    public static String whoLikesIt(String... names) {

        String noNames = "no one likes this";
        String sentences = " ";


        if(names.length == 0) {
            sentences = noNames;
        }
        else if (names.length == 1) {
            sentences += names[0]+" "+ "likes this";
        }
        else if(names.length == 2) {
            sentences +=  names[0]+" and "+names[1]+" "+"like this";
        }
        else if (names.length == 3) {
            sentences +=names[0]+", "+ names[1]+" and "+names[2]+" "+"like this";
        }
        else {
            sentences +=names[0]+", "+ names[1]+" and " + Math.abs(names.length-2)+" "+"others like this";
        }

        return sentences.trim();

    }
}
