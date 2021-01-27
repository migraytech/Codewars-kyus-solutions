import java.util.Arrays;

public class CountTheSheep {

    public static void main(String[] args) {

        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, null, true,  true };

         System.out.print(countSheeps(array1));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length ; i++) {

            if (arrayOfSheeps[i] == null) {
                arrayOfSheeps [i] = false;
            }
            if(arrayOfSheeps[i])
                ++count;
        }
        return count;
    }
}
