import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMissingLetter {

    public static void main(String[] args) {

       // assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
       // assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));

        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }) == 'e');
        System.out.println(findMissingLetter( new char[] { 'O','Q','R','S' }) == 'P');
        System.out.println(findMissingLetter( new char[] { 'u','v','w','x','z' }) == 'y');


    }

    public static char findMissingLetter(char[] array)
    {

        boolean isUpperCase = false;

        char first, last;
        int result = 0, firstIndex, latestIndex;

        char[] alphabet  =  "abcdefghijklmnopqrstuvwxyz".toCharArray();

        //check the fist and last char of array
         first = Character.toLowerCase(array[0]);
         last =  Character.toLowerCase(array[array.length-1]);

        List<Character> arrayList = new ArrayList<>();
        for(char c : array) {
            if(Character.isUpperCase(c)){
                isUpperCase = true;
                arrayList.add(Character.toLowerCase(c));
            }
            arrayList.add(Character.toLowerCase(c));
        }

        List<Character> alphabetList = new ArrayList<>();
        for(char c : alphabet) {
            alphabetList.add(Character.toLowerCase(c));
        }





         //Find the index of first of last of array in alphabet
        firstIndex = alphabetList.indexOf(first);
        latestIndex = alphabetList.indexOf(last);

        //substring the the fist and last index of alphabet
        String  removedString = new String(alphabet).substring(firstIndex,latestIndex);

        //create new list
        char [] list =  removedString.toCharArray();

        //check if doesnt contains in the list
        for(char x:list){
            if(!arrayList.contains(x)){
                result = alphabetList.indexOf(x);
                break;
            }
        }

        if(isUpperCase){
            return Character.toUpperCase(alphabet[result]);
        }
        return alphabet[result];
    }

}
