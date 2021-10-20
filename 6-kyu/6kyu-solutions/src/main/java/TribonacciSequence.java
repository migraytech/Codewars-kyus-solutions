import java.util.ArrayList;
import java.util.Arrays;

public class TribonacciSequence {

    public static void main(String[] args) {

        int n = 2;
        double [] test =  new double []{9.0, 8.0, 17.0};
        double [] test2 =  new double [] {0,1,1};
        double [] test3 =  new double [] {0,0,1};
        double [] test4 = new double[] {8.0, 4.0, 16.0};

        System.out.print(Arrays.toString(tribonacci(test,n)));
    }

    public static double[] tribonacci(double[] s,int n) {
        double[] x;
        int t = 0;
        if(n == 0) return new double[0];

        if (n <= s.length)
                {
            x = new double[n];

            for(int i = 0; i < n; i++){
                x[i] = s[i];
            }

            return x;
       }
        else
            x = new double[n];

        //fill the value of the given array
        for (double test:s) {
            x[t] = test;
            t++;
        }

        // set in dp of fill x array values
        double dp []= x;
        for (int i = 3; i < n; i++)
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

        return dp;
    }
}
