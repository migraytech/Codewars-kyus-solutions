import java.util.ArrayList;
import java.util.Arrays;

public class TribonacciSequence {

    public static void main(String[] args) {

        int n = 10;
        double [] test =  new double [] {1,1,1};
        double [] test2 =  new double [] {0,1,1};
        double [] test3 =  new double [] {0,0,1};

        System.out.print(Arrays.toString(tribonacci(test,n)));
    }



    public static double [] tribonacci(double[] s, int n )
    {
        // each index bij elkaar op tellen
        // van de vorige value
        // kijk naar aantal keer bij 10 length
        double [] newSquences = new double[0];
        for (int i=0; i<n; i++)
        {
            newSquences = s;
            

        }
        return newSquences;
    }
}
