public class NthSeries {



    //Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

    //assertEquals("1.57", NthSeries.seriesSum(5));
    //assertEquals("1.77", NthSeries.seriesSum(9));
    //assertEquals("1.94", NthSeries.seriesSum(15));

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }


    public static String seriesSum(int n) {
        // Happy Coding ^_^

        if (n == 0) {
            return "0.00";
        }
        else if (n == 1) {
            return "1.00";
        }
        else{
            double sum = 0.00;
            for (int i = 0; i <n ; i++) {
                sum +=  1.00 / (double) (1 + i * 3);
            }
            return String.format("%.2f", sum);
        }

    }
}
