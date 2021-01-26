public class VowelCount {

    public static void main(String[] args) {
        String word = "abracaiiiisseeeudabra";
        System.out.print(getCount(word));
    }

    public static int getCount(String word)
    {
       int vowels = 0;


       for (int i=0; i<word.length(); i++)
        {
            char character = word.charAt(i);
            if(character == 'a'||character == 'e'||character == 'i'||character == 'u'||character == 'o')
                ++vowels;
        }

        return vowels;
    }




}
