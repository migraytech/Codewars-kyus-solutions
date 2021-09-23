public class MiddleCharacter {


    public static void main(String[] args) {

        String word = "test";
        String word2 = "testing";
        System.out.print(getMiddle(word2));
    }


    public static String getMiddle(String word) {
        int c = 0;
        int length = word.length();
        int  previousChar = 0;

        if(word.length () % 2 == 0){
            c=length/2;
            char ch []= word.toCharArray();
            previousChar = c-1;
            Character middle = ch[previousChar];
            Character second = ch[c];
            String solution =  middle.toString() + second.toString();
            return solution;
        }
        else {
            c= length/2;
            char ch[]=word.toCharArray();
            Character middle = ch[c];
            String solution =  middle.toString();
            return  solution;
        }

    }
}
