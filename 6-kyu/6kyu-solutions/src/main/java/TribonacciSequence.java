import java.util.ArrayList;
import java.util.Arrays;

public class TribonacciSequence {

    public static void main(String[] args) {

        int n = 10;
        double [] test =  new double [] {1,1,1};
        double [] test2 =  new double [] {0,1,1};
        double [] test3 =  new double [] {0,0,1};

        System.out.print(Arrays.toString(tribonacci(test,n)));
       System.out.print(fib(10));
    }



    public static double [] tribonacci(double[] s, int n )
    {
        // each index bij elkaar op tellen
        // van de vorige value
        // kijk naar aantal keer bij 10 length
        //math om elk 3 verplaatsen en op te tellen.

        //start
        int previous = 0;
        double [] newSquences = s;



        return newSquences;
    }
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2) +fib(n-3);
    }

}
